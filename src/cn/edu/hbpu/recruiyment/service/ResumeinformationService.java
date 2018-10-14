package cn.edu.hbpu.recruiyment.service;

import cn.edu.hbpu.recruitment.pojo.Resumeinformation;

public interface ResumeinformationService {
	  
	 public Resumeinformation getResumeinformationByPeronid(int personid);
	 public int updateResumeinformation(Resumeinformation resumeinformation);
 
}
