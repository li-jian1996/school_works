package cn.edu.hbpu.recruitment.controller;
import cn.edu.hbpu.recruitment.util.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.Company;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Jobc1c2c3;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;
import cn.edu.hbpu.recruitment.pojo.Projectexperience;
import cn.edu.hbpu.recruitment.pojo.Resumeinformation;
import cn.edu.hbpu.recruitment.pojo.Workexperience;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;
import cn.edu.hbpu.recruiyment.service.AdminService;
import cn.edu.hbpu.recruiyment.service.CompanyService;
import cn.edu.hbpu.recruiyment.service.JobC1Service;
import cn.edu.hbpu.recruiyment.service.JobC3Service;
import cn.edu.hbpu.recruiyment.service.JobService;
import cn.edu.hbpu.recruiyment.service.PersonJobService;
import cn.edu.hbpu.recruiyment.service.PersonService;
import cn.edu.hbpu.recruiyment.service.ProjectexperienceService;
import cn.edu.hbpu.recruiyment.service.ResumeinformationService;
import cn.edu.hbpu.recruiyment.service.WorkexperienceService;
 
 


@Controller
public class FrontController {
    
	@Autowired
	private PersonService personService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private JobService jobService;
	@Autowired
	private JobC3Service jobC3Service;
	@Autowired
	private JobC1Service jobC1Service;
	@Autowired
	private PersonJobService personJobService;
	@Autowired
	private ResumeinformationService resumeinformationService;
	@Autowired
	private ProjectexperienceService projectexperienceService;
	@Autowired
	private WorkexperienceService workexperienceService;
	
	
	@RequestMapping("getPersonByEmail.do")
	@ResponseBody
	public Person  getPersonByEmail(String email){
		System.out.println("controllerGetperson"); 
		if (personService.getPersonByEmail(email)==null) {
			System.out.println("getPersonByEmail"+"#"+email+"未查找到");
		}
		 return  personService.getPersonByEmail(email);
	}
	@RequestMapping("getCompanyByEmail.do")
	@ResponseBody
	public Company  getCompanyByEmail(String email){
		System.out.println("controller#getCompanyByEmail"); 
		if (companyService.getCompanyByEmail(email)==null) {
			System.out.println("getPersonByEmail"+"#"+email+"未查找到");
		}
		 return  companyService.getCompanyByEmail(email);
	}
	
	@RequestMapping("register.do")
	@ResponseBody
	public int  register(int  ident,String email,String pwd,HttpSession session){
		System.out.println("register.do"+ident+email+pwd);
		if (email==null||pwd==null||email.equals("")||pwd.equals("")) {
			return 0;
		}
		pwd= SaltMD5.saltMD5(email, pwd);  //加密
 	 	if (ident==0) {
 	 		 
 			return personService.register(email, pwd);
 		 }else if (ident==1) {
 			
 			return companyService.register(email, pwd);
 		 }
		 return 0;
	}
	
 	@RequestMapping("/checkLogin.do")
	@ResponseBody
	public Map<String, String> checkLogin(int  ident,String email,String pwd,HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "error");
		pwd=SaltMD5.saltMD5(email, pwd); //加密
		//session.invalidate();    //清除session
		if (ident==0) {
			Person person=personService.checkPerson(email, pwd);
			if (person!=null) {
				session.setAttribute("ident", 0);
				session.setAttribute("person", person);
				map.put("result", "ok");
				System.out.println("用户"+ident+email+"登录");
			}
		}else {
			Company company=companyService.checkCompany(email, pwd);
			if (company!=null) {
				session.setAttribute("ident", 1);
				session.setAttribute("company", company);
				map.put("result", "ok");
				System.out.println("用户"+ident+email+"登录");
			}
		}
//		Boolean result = userService.checkLogin(user);
//		
//		String vCode = (String) session.getAttribute("vCode");
//		if (result && checkcode.equalsIgnoreCase(vCode)) {
//			session.setAttribute("user", user.getUid()+"");
//			map.put("result", "ok");
//		}else {
//			map.put("result", "error");
//		}
		
		return map;
	}
	
	@RequestMapping("register2.do")
	@ResponseBody
	public int  register2( ){
		System.out.println("controllerregister2.do");
	     personService.register("qwe", "asd");
		return 0;
		 
	}
	
	
	
	@RequestMapping("getHotJobClass.do")  //获取热门工作分类 
	@ResponseBody
	public List<Jobc3>  getHotJobClass( ){
		System.out.println("controller#getHotJobClass.do");
	    List<Job> hotJobList= jobService.getHotJobsList();
	    List<Jobc3> hotJobc3List = jobC3Service.getHotJobC3List(hotJobList);
		return hotJobc3List;
		 
	}
	
	@RequestMapping("getJobC123.do")  //获取三级工作分类
	@ResponseBody
	public List<Jobc1c2c3>  getJobC123( ){
		System.out.println("controller#getJobC123.do");
		return jobC1Service.getJobc1c2c3s();
	}
	
	@RequestMapping("getJobC123Fun2.do")  //获取三级工作分类
	@ResponseBody
	public List<Jobc1Pojo>  getJobC123Fun2( ){
		System.out.println("controller#getJobC123Fun2.do");
		
		return jobC1Service.getJobc1PojoList();
		//return jobC1Service.getJobc1c2c3s();
	}
	
	
	@RequestMapping("getHotJob.do")  //获取热门工作
	@ResponseBody
	public List<jobCompanyPojo>  getHotJob( ){
		System.out.println("controller#getHotJob.do");
		
		return jobService.getHotJobCompanyPojoList();
		//return jobC1Service.getJobc1c2c3s();
	}
	
	@RequestMapping("getNewJob.do")  //获取最新工作
	@ResponseBody
	public List<jobCompanyPojo>  getNewJob( ){
		System.out.println("controller#getNewJob.do");
		
		return jobService.getNewJobCompanyPojoList();
		//return jobC1Service.getJobc1c2c3s();
	}
	
	@RequestMapping("getindexCompany.do")  //获取首页公司列表
	@ResponseBody
	public List<Company>  getindexCompany( ){
		System.out.println("controller#getindexCompany.do");
		 List<Company> list = companyService.getIndexCompanyList();
		return  list;
		//return jobC1Service.getJobc1c2c3s();
	}
	
	@RequestMapping("/getCompanyList.do")
	@ResponseBody
	 public PageInfo<Company> getCompanyList(int page,int row,String city,String fz,String hy,String search ){
		System.out.println("controller#getCompanyList"+city+hy+fz+search);
		return companyService.listCompanyByPage(page, row,city,fz,hy,search);  
	}
    
	@RequestMapping("/getJobList.do")
	@ResponseBody
	 public PageInfo<jobCompanyPojo> getJobList(int page,int row,String city,int  salaryBegin,int salaryEnd,
			 String  jobExp,String education,int worktype ,String beginTime,String search){
		System.out.println("controller#getJobList"+city+salaryBegin+salaryEnd+jobExp+education+worktype+beginTime+search);
		return jobService.listJobCompanyPojoByPage(page, row, city, salaryBegin, salaryEnd, jobExp, education, worktype, beginTime,search);
	}
	@RequestMapping("delivery.do")
	@ResponseBody
	public int  delivery(int  jobId ,HttpSession session){
		PersonJob  personJob=new PersonJob();
		Person person=(Person)session.getAttribute("person");
		personJob.setJobid(jobId);
		personJob.setPersonid(person.getPersonid());
		personJob.setDeliverytime(new Date());
		personJob.setStatus(0);
		int line=personJobService.insert(personJob);
		if (line==1) {
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("savePerson.do")
	@ResponseBody
	public String savePerson(Person person,@RequestParam("imageFile") MultipartFile[] files) {
		System.out.println("controller#savePerson.do" );
		System.out.println(person);
		if (person.getHeadimage().equals("已选择")) {
			System.out.println("头像改变，开始上传文件");
			CommonUtils.uploadFiles(person, files);
		}
		if (person.getHeadimage().equals("未选择")) {
			System.out.println("头像未改变");
			person.setHeadimage(null);
		}
		
		System.out.println(person);
		personService.updatePerson(person);
		
		return null;
	} 
	
	@RequestMapping("getresumeinformation.do")
	@ResponseBody
	public Resumeinformation getresumeinformation(int personid) {
		System.out.println("controller#getresumeinformation.do" );
		return resumeinformationService.getResumeinformationByPeronid(personid);
	}
	
	@RequestMapping("getProjectExperience.do")
	@ResponseBody
	public Projectexperience getProjectExperience(int personid){
		System.out.println("controller#getProjectExperience.do" );
		return projectexperienceService.getProjectexperienceByPeronid(personid);
		
	}
	
	@RequestMapping("getWorkExperience.do")
	@ResponseBody
	public Workexperience getWorkExperience(int personid){
		System.out.println("controller#getWorkExperience.do" );
		return   workexperienceService.getWorkexperienceByPeronid(personid);
		
	}
	
	@RequestMapping("saveResumeinformation.do" ) 
	@ResponseBody
	public String saveResumeinformation(@RequestBody  Resumeinformation resumeinformation) {
		System.out.println("controller#saveResumeinformation.do" );
		resumeinformationService.updateResumeinformation(resumeinformation);
		System.out.println(resumeinformation);
		return "ok";
	}
	
	@RequestMapping("saveProjectExperience.do" ) 
	@ResponseBody
	public String saveProjectExperience(@RequestBody  Projectexperience projectexperience) {
		System.out.println("controller#saveResumeinformation.do" );
		projectexperienceService.updateProjectexperience(projectexperience);
		return "ok";
	}
	
	@RequestMapping("saveWorkExperience.do" ) 
	@ResponseBody
	public String saveWorkExperience(@RequestBody  Workexperience workexperience) {
		System.out.println("controller#saveResumeinformation.do" );
		workexperienceService.updateWorkexperience(workexperience);
		return "ok";
	}
	
	@RequestMapping("saveCompany.do" ) 
	@ResponseBody
	public String saveCompany(@RequestBody  Company	company) {
		System.out.println("controller#saveCompany.do" );
		System.out.println(company);
		company.setCeoimage(company.getCeoimage().substring(5));
		company.setCompanyidimage(company.getCompanyidimage().substring(5));
		company.setCompanylogo(company.getCompanylogo().substring(5));
		company.setProductimage(company.getProductimage().substring(5));
		companyService.updateCompany(company);
		return "ok";
	}
	
	@RequestMapping("insertJob.do" ) 
	@ResponseBody
	public String insertJob(@RequestBody  Job	job) {
		System.out.println("controller#insertJob.do" );
		System.out.println("新增工作"+job);
		job.setJobid(null);
		job.setBegintime(new Date());
		job.setState(1);
		jobService.insertJob(job);
		 
		return "ok";
	}
	
	@RequestMapping("getJoblistByConmpanyId.do")
	@ResponseBody        
	public PageInfo<jobCompanyPojo>  getJoblistByConmpanyId(int companyid,int state,int page,int row){
		//state 1 刚刚发布   2 下架
		return jobService.getJobListByCompanyId(companyid,state,page,row);
	}
	
	@RequestMapping("endJob.do" ) 
	@ResponseBody
	public String endJob(int jobid1) {
		System.out.println("controller#endJob.do" );
		 
		jobService.endJob(jobid1);
		return "ok";
	}
	
	@RequestMapping("delJob.do" ) 
	@ResponseBody
	public String delJob(int jobid1) {
		System.out.println("controller#delJob.do"+jobid1 );
		 
		jobService.delJob(jobid1);
		return "ok";
	}
	
	@RequestMapping("getJobByJobId.do" ) 
	@ResponseBody
	public  Job getJobByJobId(int jobid1) {
		System.out.println("controller#delJob.do"+jobid1 );
		 
		
		return jobService.getJobByJobid(jobid1);
	}
	
	@RequestMapping("getC3Name.do" ) 
	@ResponseBody
	public Map<String , String> getC3Name(int c3id) {
		System.out.println("getC3Name.do"+c3id );
		Map< String, String> map=new HashMap<String, String>();
		map.put("c3name", jobC3Service.getC3NameByC3id(c3id));
		return  map;
	}
	
	@RequestMapping("getPersonByConmpanyId.do")   //好像没什么用
	@ResponseBody        
	public PageInfo<jobCompanyPojo>  getPersonByConmpanyId(int companyid,int state,int page,int row){
		 
		System.out.println("getPersonByConmpanyId.do"  );
		return jobService.getJobListByCompanyId(companyid,state,page,row);
	}
	
	@RequestMapping("getPersonPojoByConmpanyId.do")
	@ResponseBody        
	public PageInfo<PersonPojo>  getPersonPojoByConmpanyId(int companyid,int status,int page,int row){
		 
		System.out.println("getPersonPoJoByConmpanyId.do"  );
		return   personService.getJobListByCompanyId(companyid, status, page, row);
		
	}
	
	@RequestMapping("setStatus.do" ) 
	@ResponseBody
	public Map<String , String> setStatus(int jobid,int personid,int status) {
		System.out.println("setStatus.do"  );
		Map< String, String> map=new HashMap<String, String>();
		PersonJob personJob=new PersonJob();
		personJob.setJobid(jobid);
		personJob.setPersonid(personid);
		personJob.setStatus(status);
		personJobService.update(personJob);
		return  map;
	}
	
	@RequestMapping("/getDelivery.do")
	@ResponseBody
	 public PageInfo<jobCompanyPojo> getDelivery(int status,int personid,int page,int row ){
		System.out.println("controller#getDelivery");
		return jobService.getDelivery(status, personid, page, row);
	}
	
  
}
