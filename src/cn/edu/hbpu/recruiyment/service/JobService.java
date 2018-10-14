package cn.edu.hbpu.recruiyment.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.Company;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;

public interface JobService {
	 public List<Job> getHotJobsList();
	 public List<jobCompanyPojo> getHotJobCompanyPojoList();// index .jsp  热门职位推荐
	 public List<jobCompanyPojo> getNewJobCompanyPojoList();  //index.jsp  最新工作
	 
	 public PageInfo<jobCompanyPojo> listJobCompanyPojoByPage(int page,int row,String city,int  salaryBegin,int salaryEnd,
			 String  jobExp,String education,int worktype ,String beginTime,String search);
	 
	 public PageInfo<jobCompanyPojo> getJobListByCompanyId(int companyid,int state,int page,int row);  //根据 公司id 获取对应的job
	 public int insertJob(Job job);  //插入工作
	 public void delJob(int jobid);  //删除工作
	 public void endJob(int jobid);  //结束工作
	 public Job  getJobByJobid(int jobid);
	 public PageInfo<jobCompanyPojo> getDelivery(int status,int personid,int page ,int row);//获取 投递的简历
	 
	 
}
