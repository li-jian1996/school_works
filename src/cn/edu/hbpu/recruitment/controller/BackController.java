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
 
 

@RequestMapping("/admin")
@Controller
public class BackController {
    
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
	
	

	@RequestMapping("/getRecentregister.do")
	@ResponseBody
	 public  int[] getregister(int  num){
		System.out.println("controller#getregister.do");
		int arr[]=new int [num];
		int brr[]=new int [num];
		for (int i = 1; i <= brr.length; i++) {
			brr[i-1]=personService.getRecentlyRegisterByNums(i);
			
		}
		arr[0]=brr[0];
		for (int i = 1; i < brr.length; i++) {
			arr[i]=brr[i]-brr[i-1];
		}
		return arr;
	}
	
	@RequestMapping("/getPersonList.do")
	@ResponseBody
	 public  PageInfo<Person>  getPersonList(int page,int row,String search){
		System.out.println("controller#getPersonList");
		return personService.getPersonList(page, row,search);
	}
	
	@RequestMapping("/delPerson.do")
	@ResponseBody
	public  int delPerson(int personid){
		System.out.println("controller#delPerson.do");
		System.out.println(personid);
	    personService.del(personid);
		return 0;
	}
	
	@RequestMapping("/getPersonByEmail.do")
	@ResponseBody
	public Person  getPersonByEmail(String email){
		System.out.println("controllerGetperson"); 
		if (personService.getPersonByEmail(email)==null) {
			System.out.println("getPersonByEmail"+"#"+email+"未查找到");
		}
		 return  personService.getPersonByEmail(email);
	}
  
	@RequestMapping("/savePerson.do" ) 
	@ResponseBody
	public String savePerson(@RequestBody  Person person) {
		System.out.println("controller#savePerson.do" );
		String pwd=person.getPwd();
		String email=person.getEmail();
		pwd= SaltMD5.saltMD5(email, pwd);  //加密
		person.setPwd(pwd);
		person.setHeadimage(null);
		personService.updatePerson(person);
		return "ok";
	}
	
	@RequestMapping("/getCompanyList.do")
	@ResponseBody
	 public PageInfo<Company> getCompanyList(int page,int row,String city,String fz,String hy,String search ){
		System.out.println("controller#getCompanyList"+city+hy+fz+search);
		return companyService.listCompanyByPage(page, row,city,fz,hy,search);  
	}
}
