package cn.dazky.dao;

import cn.dazky.pojo.EvaluationXueqi;
import cn.dazky.pojo.EvaluationXueqiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationXueqiMapper {
    int countByExample(EvaluationXueqiExample example);

    int deleteByExample(EvaluationXueqiExample example);

    int deleteByPrimaryKey(Integer evaluationId);

    int insert(EvaluationXueqi record);

    int insertSelective(EvaluationXueqi record);

    List<EvaluationXueqi> selectByExample(EvaluationXueqiExample example);

    EvaluationXueqi selectByPrimaryKey(Integer evaluationId);

    int updateByExampleSelective(@Param("record") EvaluationXueqi record, @Param("example") EvaluationXueqiExample example);

    int updateByExample(@Param("record") EvaluationXueqi record, @Param("example") EvaluationXueqiExample example);

    int updateByPrimaryKeySelective(EvaluationXueqi record);

    int updateByPrimaryKey(EvaluationXueqi record);
}