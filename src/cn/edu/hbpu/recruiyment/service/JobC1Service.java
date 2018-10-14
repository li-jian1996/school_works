package cn.edu.hbpu.recruiyment.service;

import java.util.List;

import cn.edu.hbpu.recruitment.pojo.Admin;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Jobc1c2c3;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Person;

public interface JobC1Service {
	 public List<Jobc1c2c3> getJobc1c2c3s();
	 public List<Jobc1Pojo> getJobc1PojoList();  //获取三级分类
}
