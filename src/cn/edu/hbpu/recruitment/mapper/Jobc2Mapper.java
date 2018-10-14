package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Jobc2;
import cn.edu.hbpu.recruitment.pojo.Jobc2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Jobc2Mapper {
    int countByExample(Jobc2Example example);

    int deleteByExample(Jobc2Example example);

    int deleteByPrimaryKey(Integer c2id);

    int insert(Jobc2 record);

    int insertSelective(Jobc2 record);

    List<Jobc2> selectByExample(Jobc2Example example);

    Jobc2 selectByPrimaryKey(Integer c2id);

    int updateByExampleSelective(@Param("record") Jobc2 record, @Param("example") Jobc2Example example);

    int updateByExample(@Param("record") Jobc2 record, @Param("example") Jobc2Example example);

    int updateByPrimaryKeySelective(Jobc2 record);

    int updateByPrimaryKey(Jobc2 record);
}