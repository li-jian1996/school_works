package cn.edu.hbpu.recruiyment.service;

import java.util.List;
import java.util.concurrent.Delayed;

import com.github.pagehelper.PageInfo;

 
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;

public interface PersonService {
	 public int register(String email,String pwd);  //注册用户
	 public Person getPersonByEmail(String email);
	 public  Person checkPerson(String email,String pwd);
	 public  int updatePerson(Person person);
	 public PageInfo<PersonPojo> getJobListByCompanyId(int companyid,int status,int page,int row);  //根据 公司id 获取对应的求职者list
	 public  int  getRecentlyRegisterByNums(int num); //查询多少天之内的注册用户
	 public PageInfo<Person> getPersonList(int page,int row,String search);
	 public int del(int personid);
	 
}
