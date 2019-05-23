package cn.dazky.dao;

import cn.dazky.pojo.AuditionInfo;
import cn.dazky.pojo.AuditionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditionInfoMapper {
    int countByExample(AuditionInfoExample example);

    int deleteByExample(AuditionInfoExample example);

    int deleteByPrimaryKey(Integer auditionId);

    int insert(AuditionInfo record);

    int insertSelective(AuditionInfo record);

    List<AuditionInfo> selectByExample(AuditionInfoExample example);

    AuditionInfo selectByPrimaryKey(Integer auditionId);

    int updateByExampleSelective(@Param("record") AuditionInfo record, @Param("example") AuditionInfoExample example);

    int updateByExample(@Param("record") AuditionInfo record, @Param("example") AuditionInfoExample example);

    int updateByPrimaryKeySelective(AuditionInfo record);

    int updateByPrimaryKey(AuditionInfo record);
}