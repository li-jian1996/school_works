package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.mapper.AdminMapper;
import cn.edu.hbpu.recruitment.mapper.PersonMapper;
import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.AdminExample;
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.PersonExample;
import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;

 

@Service
public class PerosonServiceImpl implements
		cn.edu.hbpu.recruiyment.service.PersonService {
     
	@Autowired 
	private PersonMapper  personMapper;

	public int register(String email, String pwd) {
		// TODO Auto-generated method stub
		System.out.println("进入 personServiceImpl");
		Person person=new Person();
		person.setEmail(email);
		person.setPwd(pwd);

		System.out.println("personMapper.insert"+email+pwd);
		return  personMapper.insert(person) ;
	}

	public Person getPersonByEmail(String email) {
		PersonExample personExample=new PersonExample();
		personExample.createCriteria().andEmailEqualTo(email);
		List<Person> list=personMapper.selectByExample(personExample);
		list.get(0).setHeadimage("/pic/"+list.get(0).getHeadimage());
		return list.size()>0 ? list.get(0):null;
		 
	}

	public Person checkPerson(String email, String pwd) {
		PersonExample personExample=new PersonExample();
		personExample.createCriteria().andEmailEqualTo(email).andPwdEqualTo(pwd);
		List<Person> list=personMapper.selectByExample(personExample);
		return list.size()>0 ? list.get(0):null;
	}

	public int updatePerson(Person person) {

		return personMapper.updateByPrimaryKeySelective(person);
	}

	public PageInfo<PersonPojo> getJobListByCompanyId(int companyid, int status,
			int page, int row) {
		PageHelper.startPage(page, row);
		 List<PersonPojo> list=null;
		 if (status==0) {
			  list= personMapper.getPersonPojosByCompanyid0(companyid);
		} 
		 if (status==1) {
			  list= personMapper.getPersonPojosByCompanyid1(companyid);
		}
		 if (status==2) {
			  list= personMapper.getPersonPojosByCompanyid2(companyid);
		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setHeadimage("/pic/"+list.get(i).getHeadimage());
		}
		
		PageInfo<PersonPojo> pageInfo = new PageInfo<PersonPojo>(list);
		return pageInfo ;
		 
	}

	public int getRecentlyRegisterByNums(int num) {
		// TODO Auto-generated method stub
		return personMapper.getRecentlyRegister(num);
	}

	public PageInfo<Person> getPersonList(int page,int row,String search) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, row);
		PersonExample example=new PersonExample();
		List<Person>  list1=null;
		List<Person>  list2=null;
		if (search!=null&&!search.equals("")) {
			example.createCriteria().andUsernameLike("%"+searchChange(search));
			  
		}
		 list1 =personMapper.selectByExample(example);
          
          
		PageInfo<Person> pageInfo = new PageInfo<Person>(list1);
		return pageInfo ;
	}

	public int del(int personid) {
		
		return  personMapper.deleteByPrimaryKey(personid);
	}
	public String searchChange(String search){
		
		String searchChangeString="";
		for (int i = 0; i < search.length(); i++) {
			searchChangeString+=searchChangeString+search.charAt(i)+"%";
		}
		
		return searchChangeString;
	}

}
