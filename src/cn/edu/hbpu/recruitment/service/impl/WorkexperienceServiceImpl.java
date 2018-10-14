package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.WorkexperienceMapper;
import cn.edu.hbpu.recruitment.pojo.Workexperience;
import cn.edu.hbpu.recruitment.pojo.WorkexperienceExample;
import cn.edu.hbpu.recruiyment.service.WorkexperienceService;

@Service
public class WorkexperienceServiceImpl implements WorkexperienceService {

	@Autowired
	private WorkexperienceMapper workexperienceMapper;
	
	public Workexperience getWorkexperienceByPeronid(int personid) {
		// TODO Auto-generated method stub
		WorkexperienceExample example=new WorkexperienceExample();
		example.createCriteria().andPersonidEqualTo(personid);
		List<Workexperience> list =workexperienceMapper.selectByExample(example);
		return list.size()>0 ? list.get(0):null;
	}

	public int updateWorkexperience(Workexperience workexperience) {
		// TODO Auto-generated method stub
		return workexperienceMapper.updateByPrimaryKeySelective(workexperience);
	}

}
