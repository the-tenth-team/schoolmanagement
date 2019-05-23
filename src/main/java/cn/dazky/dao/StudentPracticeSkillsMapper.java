package cn.dazky.dao;

import cn.dazky.pojo.StudentPracticeSkills;
import cn.dazky.pojo.StudentPracticeSkillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentPracticeSkillsMapper {
    int countByExample(StudentPracticeSkillsExample example);

    int deleteByExample(StudentPracticeSkillsExample example);

    int deleteByPrimaryKey(Integer studentPracticeId);

    int insert(StudentPracticeSkills record);

    int insertSelective(StudentPracticeSkills record);

    List<StudentPracticeSkills> selectByExample(StudentPracticeSkillsExample example);

    StudentPracticeSkills selectByPrimaryKey(Integer studentPracticeId);

    int updateByExampleSelective(@Param("record") StudentPracticeSkills record, @Param("example") StudentPracticeSkillsExample example);

    int updateByExample(@Param("record") StudentPracticeSkills record, @Param("example") StudentPracticeSkillsExample example);

    int updateByPrimaryKeySelective(StudentPracticeSkills record);

    int updateByPrimaryKey(StudentPracticeSkills record);
}