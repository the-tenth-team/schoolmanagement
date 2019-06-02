package cn.dazky.service;

import cn.dazky.pojo.RoleAnthorityInfo;

import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/1 15:53
 */
public interface RoleAnthorityService {

   public List<RoleAnthorityInfo> getAllWithAnthortyByRoleId(Integer roleId,Integer anthortyPid);

}
