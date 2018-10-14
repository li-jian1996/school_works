package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.PersonJob;
import cn.edu.hbpu.recruitment.pojo.PersonJobExample;
import cn.edu.hbpu.recruitment.pojo.PersonJobKey;
import cn.edu.hbpu.recruitment.pojo.PersonPojo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonJobMapper {
    int countByExample(PersonJobExample example);

    int deleteByExample(PersonJobExample example);

    int deleteByPrimaryKey(PersonJobKey key);

    int insert(PersonJob record);

    int insertSelective(PersonJob record);

    List<PersonJob> selectByExample(PersonJobExample example);

    PersonJob selectByPrimaryKey(PersonJobKey key);

    int updateByExampleSelective(@Param("record") PersonJob record, @Param("example") PersonJobExample example);

    int updateByExample(@Param("record") PersonJob record, @Param("example") PersonJobExample example);

    int updateByPrimaryKeySelective(PersonJob record);

    int updateByPrimaryKey(PersonJob record);
    
   
}