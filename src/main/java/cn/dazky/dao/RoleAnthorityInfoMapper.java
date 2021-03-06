package cn.dazky.dao;

import cn.dazky.pojo.RoleAnthorityInfo;
import cn.dazky.pojo.RoleAnthorityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAnthorityInfoMapper {
    int countByExample(RoleAnthorityInfoExample example);

    int deleteByExample(RoleAnthorityInfoExample example);

    int deleteByPrimaryKey(Integer roleAnthorityId);

    int insert(RoleAnthorityInfo record);

    int insertSelective(RoleAnthorityInfo record);

    List<RoleAnthorityInfo> selectByExample(RoleAnthorityInfoExample example);

    List<RoleAnthorityInfo> selectWithAnthortyByPrimaryKey(Integer role_id,Integer anthorty_pid);

    RoleAnthorityInfo selectByPrimaryKey(Integer roleAnthorityId);

    int updateByExampleSelective(@Param("record") RoleAnthorityInfo record, @Param("example") RoleAnthorityInfoExample example);

    int updateByExample(@Param("record") RoleAnthorityInfo record, @Param("example") RoleAnthorityInfoExample example);

    int updateByPrimaryKeySelective(RoleAnthorityInfo record);

    int updateByPrimaryKey(RoleAnthorityInfo record);
}