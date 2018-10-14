package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.AdminMapper;
import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.AdminExample;

 

@Service
public class AdminServiceImpl implements
		cn.edu.hbpu.recruiyment.service.AdminService {
     
	@Autowired 
	private AdminMapper adminMapper;
	
	public List<Admin> getAdminsList() {
		AdminExample example=new AdminExample();
		System.out.println("serviceImpl");
		return  adminMapper.selectByExample(example);
	}

}
