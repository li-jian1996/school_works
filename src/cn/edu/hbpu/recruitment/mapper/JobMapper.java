package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Job;
import cn.edu.hbpu.recruitment.pojo.JobExample;
import cn.edu.hbpu.recruitment.pojo.jobCompanyPojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    int countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);
    
    List<jobCompanyPojo> selectJobCompanyPojoByExample(JobExample example);
    
    List<jobCompanyPojo> selectJobCompanyByExample();
    
    List<jobCompanyPojo> selectNewJobCompany();
    
    Job selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
    List<jobCompanyPojo> selectJobCompanyPojoByExample1(Integer companyid );
    List<jobCompanyPojo> selectJobCompanyPojoByExample2(Integer companyid );
    
    List<jobCompanyPojo> selectJobCompanyPojoByPersonid99(Integer personid );
    List<jobCompanyPojo> selectJobCompanyPojoByPersonid0(Integer personid );
    List<jobCompanyPojo> selectJobCompanyPojoByPersonid1(Integer personid  );
    List<jobCompanyPojo> selectJobCompanyPojoByPersonid2(Integer personid );
    
}