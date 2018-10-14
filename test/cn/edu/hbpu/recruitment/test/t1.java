package cn.edu.hbpu.recruitment.test;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import cn.edu.hbpu.recruitment.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.mapper.JobMapper;
import cn.edu.hbpu.recruitment.mapper.PersonJobMapper;
import cn.edu.hbpu.recruitment.mapper.PersonMapper;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Jobc1c2c3;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;
import cn.edu.hbpu.recruiyment.service.JobC1Service;
import cn.edu.hbpu.recruiyment.service.JobC3Service;
import cn.edu.hbpu.recruiyment.service.JobService;
import cn.edu.hbpu.recruiyment.service.PersonJobService;
 
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class t1 {
	@Autowired
	private PersonMapper personMapper;
	
	@Autowired
	private JobMapper jobMapper;
	
	@Autowired
	private JobService jobService;
	@Autowired
	private JobC3Service jobC3Service;
	@Autowired 
	private JobC1Service jobC1Service;
	@Autowired
	private PersonJobService personJobService;
	
//	@Test
//	public void test01(){
//		 Person person=new Person();
//		 person.setEmail("qwe");
//		 person.setPwd("231");
//		 personMapper.insert(person);
//	}
	
//	@Test
//	public void test02(){
//		 List<Job> hotJobList= jobService.getHotJobsList();
//
//	     List<Jobc3> hotJobc3List = jobC3Service.getHotJobC3List(hotJobList);
////		 for (int i = 0; i <  hotJobc3List.size(); i++) {
////		 System.out.println(hotJobc3List.get(i).getC3id()+hotJobc3List.get(i).getC3name());
////	     }
//	}
	
//	@Test
//	public void test03(){
//		 List<Jobc1c2c3>  List= jobC1Service.getJobc1c2c3s();
//	}
	
//	@Test
//	public void test04(){
//		List<Jobc1Pojo>  List= jobC1Service.getJobc1PojoList();
//	}
	
//	@Test
//	public void test05(){
//		jobService.getHotJobCompanyPojoList();
//	}
//	@Test
//	public void test05(){
//		PageInfo<jobCompanyPojo> pageInfo=	jobService.listJobCompanyPojoByPage(1, 10, "全国", 0, 50, "不限", "不限", 1 , "shij","H");
//		System.out.println(pageInfo.getList().size());
//		System.out.println( pageInfo.getList().get(0).getJobid()+"!"+pageInfo.getList().get(0).getC3id());
//	}
//	@Test
//	public void test05(){
//		 PersonJob  personJob=new PersonJob();
//		 personJob.setJobid(2432311);
//		 personJob.setPersonid(1);
//		System.out.println("line"+ personJobService.insert(personJob));
//	}
	
//	@Test
//	public void test06(){
//		 Person person=new Person();
//		 person.setPersonid(97719057);
//		 person.setAge(49);
//		 personMapper.updateByPrimaryKeySelective(person);
//	}
//	@Test
//	public void test05(){
//	PageInfo<jobCompanyPojo> pageInfo=	jobService. getJobListByCompanyId(99909736,2,2,5);
//	System.out.println(pageInfo.getList().size());
//	System.out.println( pageInfo.getList().get(0).getJobid()+"!"+pageInfo.getList().get(0).getC3id());
//}
//	@Test
//	public void test08(){
//	  List<PersonPojo> list=	  personMapper.getPersonPojosByCompanyid0(99909736 );
//	  System.out.println(list.size());
//	  System.out.println(list);
//	//System.out.println(pageInfo.getList().size());
//	//System.out.println( pageInfo.getList().get(0).getJobid()+"!"+pageInfo.getList().get(0).getC3id());
////}
//	@Test
//	public void test09(){
//	  List<jobCompanyPojo> list=jobMapper.selectJobCompanyPojoByPersonid99(97719057);
//	  System.out.println(list.size());
//	  System.out.println(list);
//	 
//}
	@Test
	public void test10(){
	   int n= personMapper.getRecentlyRegister(1);
	   
	  System.out.println("注册的数量"+n);
	 
}
 
}
