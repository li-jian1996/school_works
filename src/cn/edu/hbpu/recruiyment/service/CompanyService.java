package cn.edu.hbpu.recruiyment.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.Company;
import cn.edu.hbpu.recruitment.pojo.Person;

public interface CompanyService {
	 public  int  register(String email,String pwd);  //注册用户
	 public Company getCompanyByEmail(String email);
	 public Company checkCompany(String email,String pwd);
	 public List<Company> getIndexCompanyList();
	 PageInfo<Company> listCompanyByPage(int page,int row,String city,String fz,String hy,String search);
	 public void updateCompany(Company company) ;
	 
}
