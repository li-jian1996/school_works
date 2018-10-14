package cn.edu.hbpu.recruiyment.service;

import cn.edu.hbpu.recruitment.pojo.Projectexperience;
import cn.edu.hbpu.recruitment.pojo.Resumeinformation;
import cn.edu.hbpu.recruitment.pojo.Workexperience;

public interface WorkexperienceService {
	  
	 public Workexperience getWorkexperienceByPeronid(int personid);
	 public int updateWorkexperience(Workexperience workexperience);
 
}
