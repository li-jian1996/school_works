package cn.edu.hbpu.recruiyment.service;

import cn.edu.hbpu.recruitment.pojo.Projectexperience;
import cn.edu.hbpu.recruitment.pojo.Resumeinformation;

public interface ProjectexperienceService {
	  
	 public Projectexperience getProjectexperienceByPeronid(int personid);
	 public int updateProjectexperience(Projectexperience projectexperience);
 
}
