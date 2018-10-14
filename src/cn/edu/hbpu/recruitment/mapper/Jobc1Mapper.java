package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Jobc1;
import cn.edu.hbpu.recruitment.pojo.Jobc1Example;
import cn.edu.hbpu.recruitment.pojo.Jobc1c2c3;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Jobc1Mapper {
    int countByExample(Jobc1Example example);

    int deleteByExample(Jobc1Example example);

    int deleteByPrimaryKey(Integer c1id);

    int insert(Jobc1 record);

    int insertSelective(Jobc1 record);
    List<Jobc1c2c3> selectc1c2c3();
    List<Jobc1> selectByExample(Jobc1Example example);

    Jobc1 selectByPrimaryKey(Integer c1id);

    int updateByExampleSelective(@Param("record") Jobc1 record, @Param("example") Jobc1Example example);

    int updateByExample(@Param("record") Jobc1 record, @Param("example") Jobc1Example example);

    int updateByPrimaryKeySelective(Jobc1 record);

    int updateByPrimaryKey(Jobc1 record);
}