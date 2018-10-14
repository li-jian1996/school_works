package cn.edu.hbpu.recruitment.mapper;

import cn.edu.hbpu.recruitment.pojo.Projectexperience;
import cn.edu.hbpu.recruitment.pojo.ProjectexperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectexperienceMapper {
    int countByExample(ProjectexperienceExample example);

    int deleteByExample(ProjectexperienceExample example);

    int deleteByPrimaryKey(Integer projectexperienceid);

    int insert(Projectexperience record);

    int insertSelective(Projectexperience record);

    List<Projectexperience> selectByExample(ProjectexperienceExample example);

    Projectexperience selectByPrimaryKey(Integer projectexperienceid);

    int updateByExampleSelective(@Param("record") Projectexperience record, @Param("example") ProjectexperienceExample example);

    int updateByExample(@Param("record") Projectexperience record, @Param("example") ProjectexperienceExample example);

    int updateByPrimaryKeySelective(Projectexperience record);

    int updateByPrimaryKey(Projectexperience record);
}