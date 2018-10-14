package cn.edu.hbpu.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruiyment.service.AdminService;

 

@Controller
public class AdminController {
	@Autowired 
	private AdminService adminService;
	
	@RequestMapping("getAdminList.do")
	@ResponseBody
	public List<Admin>  getAdminList(){
		System.out.println("controller");
		 List<Admin> list=adminService.getAdminsList();
		 ModelAndView modelAndView=new ModelAndView();
		 modelAndView.addObject("adminList",list);
		 modelAndView.setViewName("/index");
		 System.out.println("admin列表大小"+list.size());
		 return list;
	}
	
	
}
