package cn.edu.hbpu.recruitment.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.recruitment.mapper.Jobc1Mapper;
import cn.edu.hbpu.recruitment.mapper.Jobc2Mapper;
import cn.edu.hbpu.recruitment.mapper.Jobc3Mapper;
import cn.edu.hbpu.recruitment.pojo.Jobc1;
import cn.edu.hbpu.recruitment.pojo.Jobc1Example;
import cn.edu.hbpu.recruitment.pojo.Jobc1Pojo;
import cn.edu.hbpu.recruitment.pojo.Jobc1c2c3;
import cn.edu.hbpu.recruitment.pojo.Jobc2;
import cn.edu.hbpu.recruitment.pojo.Jobc2Example;
import cn.edu.hbpu.recruitment.pojo.Jobc2Pojo;
import cn.edu.hbpu.recruitment.pojo.Jobc3Example;
import cn.edu.hbpu.recruiyment.service.JobC1Service;
@Service
public class JobC1ServiceImpl implements JobC1Service {
     
	@Autowired
	private Jobc1Mapper jobc1Mapper;
	@Autowired
	private Jobc2Mapper jobc2Mapper;
	@Autowired
	private Jobc3Mapper jobc3Mapper;
	
	public List<Jobc1c2c3> getJobc1c2c3s() {
		return  jobc1Mapper.selectc1c2c3();
	}

	public List<Jobc1Pojo> getJobc1PojoList() {
       
        Jobc1Example jobc1Example=new Jobc1Example();
        List<Jobc1 > jobc1List= jobc1Mapper.selectByExample(jobc1Example);
        List<Jobc1Pojo> jobc1PojosList=new ArrayList<Jobc1Pojo>( );
         
        for (int i = 0; i < jobc1List.size(); i++) {
        	Jobc1Pojo jobc1Pojo=new Jobc1Pojo();
        	jobc1Pojo.setC1id(jobc1List.get(i).getC1id());
        	jobc1Pojo.setC1name(jobc1List.get(i).getC1name());
			
			Jobc2Example jobc2Example=new Jobc2Example();
			jobc2Example.createCriteria().andC1idEqualTo(jobc1Pojo.getC1id());
			List<Jobc2 > jobc2List= jobc2Mapper.selectByExample(jobc2Example);
			List<Jobc2Pojo> jobc2PojosList=new ArrayList<Jobc2Pojo>( );
			
			for (int j = 0; j < jobc2List.size(); j++) {
				Jobc2Pojo jobc2Pojo=new Jobc2Pojo();
				jobc2Pojo.setC1id(jobc2List.get(j).getC1id());
				jobc2Pojo.setC2id(jobc2List.get(j).getC2id());
				jobc2Pojo.setC2name(jobc2List.get(j).getC2name());
				Jobc3Example jobc3Example=new Jobc3Example();
				jobc3Example.createCriteria().andC2idEqualTo(jobc2Pojo.getC2id());
				jobc2Pojo.setJobc3List( jobc3Mapper.selectByExample(jobc3Example));
				jobc2PojosList.add(jobc2Pojo);
			}
			jobc1Pojo.setJobc2PojoList(jobc2PojosList);
			jobc1PojosList.add(jobc1Pojo);
			
		}
        
        
        
		return jobc1PojosList;
	}

}
