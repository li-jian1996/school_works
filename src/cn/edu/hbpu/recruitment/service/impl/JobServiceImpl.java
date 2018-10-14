package cn.edu.hbpu.recruitment.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleIfStatement.Else;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.mapper.JobMapper;
import cn.edu.hbpu.recruitment.mapper.Jobc3Mapper;
import cn.edu.hbpu.recruitment.pojo.Company;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.JobExample;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Jobc3Example;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;
import cn.edu.hbpu.recruitment.pojo.JobExample.Criteria;
 
import cn.edu.hbpu.recruiyment.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobMapper jobMapper;
	
	@Autowired
	private Jobc3Mapper jobc3Mapper;
	
	public List<Job> getHotJobsList() {
		return  getHotJobsList(10);
	}

	public List<jobCompanyPojo> getHotJobCompanyPojoList() {

        List<jobCompanyPojo> jobCompanyPojoList=new ArrayList<jobCompanyPojo>();
        jobCompanyPojoList =jobMapper.selectJobCompanyByExample( );
        jobCompanyPojoList=jobCompanyPojoList.subList(0, 15);
		return jobCompanyPojoList;
	}
	
	public List<Job> getHotJobsList(int num) {
		JobExample jobExample=new JobExample();
		jobExample.setOrderByClause("hits desc");
		List<Job> list=jobMapper.selectByExample(jobExample);
		list=list.subList(0, num);
		return list;
	}

	public List<jobCompanyPojo> getNewJobCompanyPojoList() {
		List<jobCompanyPojo> jobCompanyPojoList=new ArrayList<jobCompanyPojo>();
        jobCompanyPojoList =jobMapper.selectNewJobCompany();
        jobCompanyPojoList=jobCompanyPojoList.subList(0, 15);
		return jobCompanyPojoList;
	}

	public PageInfo<jobCompanyPojo> listJobCompanyPojoByPage(int page, int row,
			String city, int salaryBegin, int salaryEnd, String jobExp,
			String education, int worktype, String beginTime ,String search) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, row);
		System.out.println("companyService##"+city+salaryBegin+salaryEnd+jobExp+education+worktype+beginTime);
		city=city.trim();
		jobExp=jobExp.trim();
		education=education.trim();
		beginTime=beginTime.trim();
		search=search.trim();
		System.out.println("search length"+search.length()+"searchBegin"+search+"End");
	
		
		JobExample example=new JobExample();
		Criteria criteria= example.createCriteria();
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("大专", 0);
		map.put("本科", 1);
		map.put("硕士", 2);
		map.put("博士", 3);
		map.put("不限", 4);
		if (city.equals("全国")||city.equals("其他")) {
			city="";
		}
		if (jobExp.equals("不限")) {
			jobExp="";
		}
		if (city!=null||!city.equals("")) {
	    	criteria.andJobcityLike("%"+city+"%");
	    }
		if (salaryBegin!=0) {
	    	criteria.andSalarybeginGreaterThanOrEqualTo(salaryBegin);
	    }
		if (salaryEnd!=0) {
	    	criteria.andSalaryendLessThanOrEqualTo(salaryEnd);
	    }
		if (jobExp!=null||!jobExp.equals("") ) {
	    	criteria.andJobexperienceLike("%"+jobExp+"%");
	    }
		int edu=map.get(education);
		if (edu!=4) {
			criteria.andEducationBetween(edu, 3);
		}
      
        if (worktype>=0) {
        	 criteria.andWorktypeEqualTo(worktype);
		}
       
		//criteria.andBegintimeBetween(new Date(), new Date());
        List<jobCompanyPojo> list=new ArrayList<jobCompanyPojo>();
        List<jobCompanyPojo> list1=new ArrayList<jobCompanyPojo>();
        List<jobCompanyPojo> list2=new ArrayList<jobCompanyPojo>();
     
		 list=jobMapper.selectJobCompanyPojoByExample(example);
		 list1=jobMapper.selectJobCompanyPojoByExample(example);
		 System.out.println("list size"+list.size());
		 for (jobCompanyPojo jobCompanyPojo  : list) {
       	//  System.out.println(jobCompanyPojo.getC3id());
		}
		 
		//处理search  通过查找的文字  反查出C3ID
		Jobc3Example jobc3Example=new Jobc3Example();
		jobc3Example.createCriteria().andC3nameLike("%"+search+"%");
		List<Jobc3> jobc3list= jobc3Mapper.selectByExample(jobc3Example);
		System.out.println("jobc3listsize"+jobc3list.size()); 
		
		List<Integer> c3IdList=new ArrayList<Integer>();
		System.out.println("打印 jobc3lis"+jobc3list.size());
        for (Jobc3 jobc3  : jobc3list) {
        	//  System.out.println(jobc3.getC3id());
			  c3IdList.add(jobc3.getC3id());
		}
		System.out.println("打印 jobCompanyPojoLIST"+list.size());
		if (c3IdList.size()>0&&!search.equals("")) {
			for (jobCompanyPojo jobCompanyPojo : list1) {
				  // System.out.println( jobCompanyPojo.getC3id());
				   if (isHave(c3IdList,jobCompanyPojo.getC3id())==1) {
					list2.add(jobCompanyPojo);
				}
			}
		}else {
			list2=list;
		}
	    
		System.out.println("list2 Size"+list2.size());
		 
		PageInfo<jobCompanyPojo> pageInfo = new PageInfo<jobCompanyPojo>(list2);
		return pageInfo ;
	}

    

	public PageInfo<jobCompanyPojo> getJobListByCompanyId(int companyid,int state,int page,int  row) {
		PageHelper.startPage(page, row);
		List<jobCompanyPojo> list2=null ;
	     if (state==1) {
	    	 list2=jobMapper.selectJobCompanyPojoByExample1(companyid);  // 
		}
	     if (state==2){
	    	 list2=jobMapper.selectJobCompanyPojoByExample2(companyid);  // 
		}
	     
		
		 
		PageInfo<jobCompanyPojo> pageInfo = new PageInfo<jobCompanyPojo>(list2);
		return pageInfo ;
	}
     
	public int insertJob(Job job) {
		job.setBegintime(new Date());
		jobMapper.insert(job);
		return 0;
	}

	public void delJob(int jobid) {
		// TODO Auto-generated method stub
		Job job=new Job();
		job.setJobid(jobid);
		job.setState(0);
		jobMapper.updateByPrimaryKeySelective(job);
	}

	public void endJob(int jobid) {
		// TODO Auto-generated method stub
		Job job=new Job();
		job.setJobid(jobid);
		job.setState(2);
		job.setEndtime(new Date());
		jobMapper.updateByPrimaryKeySelective(job);
	}

	public Job getJobByJobid(int jobid) {
		// TODO Auto-generated method stub
		return jobMapper.selectByPrimaryKey(jobid);
	}
	
	
	 public int  isHave(List<Integer> c3IdList,int c3id) {
		 for (Integer integer : c3IdList) {
			  if (c3id==integer.intValue()) {
				return 1;
			}
		}
    	 return 0;
	}
     
    public int  jobToJobCompanyPojo(List<Job> list,List<jobCompanyPojo> list2) {
		
    	for (Job job : list) {
    		jobCompanyPojo jobCompanyPojo=new jobCompanyPojo();
			jobCompanyPojo.setJobid(job.getJobid());
			jobCompanyPojo.setC3id(job.getC3id());
			jobCompanyPojo.setDepartments(job.getDepartments());
			jobCompanyPojo.setWorktype(job.getWorktype());
			jobCompanyPojo.setEducation(job.getEducation());
			jobCompanyPojo.setJobtemptation(jobCompanyPojo.getJobtemptation());
			jobCompanyPojo.setJobdescribe(job.getJobdescribe());
			jobCompanyPojo.setJobaddress(job.getJobaddress());
			jobCompanyPojo.setSalarybegin(job.getSalarybegin());
			jobCompanyPojo.setSalaryend(job.getSalaryend());
			jobCompanyPojo.setJobcity(job.getJobcity());
			jobCompanyPojo.setJobexperience(job.getJobexperience());
			jobCompanyPojo.setBegintime(job.getBegintime());
			Jobc3 jobc3=jobc3Mapper.selectByPrimaryKey(job.getC3id());
			jobCompanyPojo.setC3Name(jobc3.getC3name());
			list2.add(jobCompanyPojo);
		}
    	
    	 
    	return 1;
	}

	public PageInfo<jobCompanyPojo> getDelivery(int status,int personid,int page ,int row) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, row);
		List<jobCompanyPojo> list=null;
		if (status==-1) {
			list=jobMapper.selectJobCompanyPojoByPersonid99(personid);
		}
		if (status==0) {
			list=jobMapper.selectJobCompanyPojoByPersonid0(personid);
		}
		if (status==1) {
			list=jobMapper.selectJobCompanyPojoByPersonid1(personid);
		}
		if (status==2) {
			list=jobMapper.selectJobCompanyPojoByPersonid2(personid);
		}
		PageInfo<jobCompanyPojo> pageInfo = new PageInfo<jobCompanyPojo>(list);
		return pageInfo ;
	}
	

}
