package cn.dazky.service;

import cn.dazky.pojo.RoleInfo;

import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/3 19:10
 * 角色控制器
 */
public interface RoleInfoSerivce {

    /**
     * 获取所有的角色
     * @return
     */
    List<RoleInfo> getAllRole();

    /**
     * 根据角色id获取角色信息
     * @param roleId
     * @return
     */
    RoleInfo getRoleById(Integer roleId);
}
