package cn.edu.hbpu.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.ResumeinformationMapper;
import cn.edu.hbpu.recruitment.pojo.Resumeinformation;
import cn.edu.hbpu.recruitment.pojo.ResumeinformationExample;
import cn.edu.hbpu.recruiyment.service.ResumeinformationService;

@Service
public class ResumeinformationServiceImpl implements ResumeinformationService {
  
	@Autowired
	private ResumeinformationMapper resumeinformationMapper;
	
	public Resumeinformation getResumeinformationByPeronid(int personid) {
		// TODO Auto-generated method stub
		ResumeinformationExample example=new ResumeinformationExample();
		example.createCriteria().andPersonidEqualTo(personid);
		List<Resumeinformation> list=resumeinformationMapper.selectByExample(example);
		return list.size()>0 ? list.get(0):null;
		 
	}

	public int updateResumeinformation(Resumeinformation resumeinformation) {
		return resumeinformationMapper.updateByPrimaryKeySelective(resumeinformation);
	}

}
