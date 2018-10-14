package cn.edu.hbpu.recruiyment.service;

import java.util.List;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Person;

public interface JobC3Service {
	 public List<Jobc3> getHotJobC3List(List<Job> jobList);
	  
	 public List<Jobc3> getJobc3ListByC2Id(int c2id);
	 
	 public String getC3NameByC3id(int c3id);
		
	 
}
