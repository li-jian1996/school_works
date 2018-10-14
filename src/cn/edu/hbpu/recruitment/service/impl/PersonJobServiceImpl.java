package cn.edu.hbpu.recruitment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.PersonJobMapper;
import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruiyment.service.PersonJobService;

@Service
public class PersonJobServiceImpl implements PersonJobService {
   
 	@Autowired 
 	private PersonJobMapper personJobMapper;
	public int insert(PersonJob personJob) {
 		
 		int line = personJobMapper.insertSelective(personJob);
 		return line;
		  
	}
	public int update(PersonJob personJob) {
		// TODO Auto-generated method stub
		return 	personJobMapper.updateByPrimaryKeySelective(personJob);
		 
	}

}
