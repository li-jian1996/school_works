package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.ProjectexperienceMapper;
import cn.edu.hbpu.recruitment.pojo.Projectexperience;
import cn.edu.hbpu.recruitment.pojo.ProjectexperienceExample;
import cn.edu.hbpu.recruiyment.service.ProjectexperienceService;

@Service
public class ProjectexperienceServiceImpl implements ProjectexperienceService {
    
	@Autowired
	private ProjectexperienceMapper projectexperienceMapper;
	public Projectexperience getProjectexperienceByPeronid(int personid) {
		// TODO Auto-generated method stub
		ProjectexperienceExample example=new ProjectexperienceExample();
		example.createCriteria().andPersonidEqualTo(personid);
		List<Projectexperience> list=projectexperienceMapper.selectByExample(example);
		return list.size()>0 ? list.get(0):null;
	}

	public int updateProjectexperience(Projectexperience projectexperience) {
		// TODO Auto-generated method stub
		return projectexperienceMapper.updateByPrimaryKeySelective(projectexperience);
	}

}
