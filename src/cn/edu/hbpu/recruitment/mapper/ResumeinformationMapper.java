package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Resumeinformation;
import cn.edu.hbpu.recruitment.pojo.ResumeinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeinformationMapper {
    int countByExample(ResumeinformationExample example);

    int deleteByExample(ResumeinformationExample example);

    int deleteByPrimaryKey(Integer resumeid);

    int insert(Resumeinformation record);

    int insertSelective(Resumeinformation record);

    List<Resumeinformation> selectByExample(ResumeinformationExample example);

    Resumeinformation selectByPrimaryKey(Integer resumeid);

    int updateByExampleSelective(@Param("record") Resumeinformation record, @Param("example") ResumeinformationExample example);

    int updateByExample(@Param("record") Resumeinformation record, @Param("example") ResumeinformationExample example);

    int updateByPrimaryKeySelective(Resumeinformation record);

    int updateByPrimaryKey(Resumeinformation record);
}