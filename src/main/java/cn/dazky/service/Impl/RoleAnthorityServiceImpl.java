package cn.dazky.service.Impl;

import cn.dazky.dao.RoleAnthorityInfoMapper;
import cn.dazky.pojo.RoleAnthorityInfo;
import cn.dazky.service.RoleAnthorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/1 15:56
 */
@Service
public class RoleAnthorityServiceImpl implements RoleAnthorityService {

    @Resource
    private RoleAnthorityInfoMapper roleAnthorityInfoMapper;

    @Override
    public List<RoleAnthorityInfo> getAllWithAnthortyByRoleId(Integer roleId,Integer anthortyPid) {
        return roleAnthorityInfoMapper.selectWithAnthortyByPrimaryKey(roleId,anthortyPid);
    }
}
