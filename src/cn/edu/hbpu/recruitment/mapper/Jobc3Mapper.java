package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Jobc3;
import cn.edu.hbpu.recruitment.pojo.Jobc3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Jobc3Mapper {
    int countByExample(Jobc3Example example);

    int deleteByExample(Jobc3Example example);

    int deleteByPrimaryKey(Integer c3id);

    int insert(Jobc3 record);

    int insertSelective(Jobc3 record);

    List<Jobc3> selectByExample(Jobc3Example example);

    Jobc3 selectByPrimaryKey(Integer c3id);

    int updateByExampleSelective(@Param("record") Jobc3 record, @Param("example") Jobc3Example example);

    int updateByExample(@Param("record") Jobc3 record, @Param("example") Jobc3Example example);

    int updateByPrimaryKeySelective(Jobc3 record);

    int updateByPrimaryKey(Jobc3 record);
}