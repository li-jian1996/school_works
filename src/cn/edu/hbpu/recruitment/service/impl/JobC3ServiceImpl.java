package cn.edu.hbpu.recruitment.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.Jobc1Mapper;
import cn.edu.hbpu.recruitment.mapper.Jobc2Mapper;
import cn.edu.hbpu.recruitment.mapper.Jobc3Mapper;
import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Jobc3Example;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Jobc3Example.Criteria;
import cn.edu.hbpu.recruiyment.service.JobC3Service;
@Service
public class JobC3ServiceImpl implements JobC3Service {
    
	@Autowired
	private Jobc3Mapper jobc3Mapper;
	@Autowired
	private Jobc2Mapper jobc2Mapper;
	@Autowired
	private Jobc1Mapper jobc1Mapper;
	public List<Jobc3> getHotJobC3List(List<Job> jobList) {
		// TODO Auto-generated method stub
		List<Jobc3> jobc3List=new ArrayList<Jobc3>();
		
	 
		for (int i = 0; i < jobList.size(); i++) {
			Jobc3Example example=new Jobc3Example();
			Criteria criteria= example.createCriteria();
			criteria.andC3idEqualTo(jobList.get(i).getC3id());
		    Jobc3 jobc3= jobc3Mapper.selectByExample(example).get(0);
		    if (isHave(jobc3List, jobc3)==1) {  //去重
				jobc3List.add(jobc3);
			}
		}
		return jobc3List;
	}
	
	//判断是否重复
	public int isHave (List<Jobc3> jobc3List , Jobc3 jobc3) {
		for (int i = 0; i < jobc3List.size(); i++) {
			if (jobc3List.get(i).getC3id()==jobc3.getC3id()) {
				return 0;
			}
		}
		return 1;
	}

	 

	public List<Jobc3> getJobc3ListByC2Id(int c2id) {
		// TODO Auto-generated method stub
		Jobc3Example example=new Jobc3Example();
		example.createCriteria().andC2idEqualTo(c2id);
		return jobc3Mapper.selectByExample(example);
	}

	public String getC3NameByC3id(int c3id) {
		// TODO Auto-generated method stub
		Jobc3 jobc3= jobc3Mapper.selectByPrimaryKey(c3id);
		
		if (jobc3!=null) {
			return jobc3.getC3name();
		}
		return "";
	}

	 

}
