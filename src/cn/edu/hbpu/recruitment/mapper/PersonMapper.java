package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Person;
import cn.edu.hbpu.recruitment.pojo.PersonExample;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer personid);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Integer personid);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    List<PersonPojo> getPersonPojosByCompanyid0(Integer companyid );  //我要是能看得懂mybatis   我肯定不会写的这么丑的代码
    List<PersonPojo> getPersonPojosByCompanyid1(Integer companyid );   //2018年9月23日 06:28:24
    List<PersonPojo> getPersonPojosByCompanyid2(Integer companyid );    //李健
    
    int getRecentlyRegister(Integer num);
}