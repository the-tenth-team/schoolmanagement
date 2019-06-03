package cn.dazky.service.Impl;

import cn.dazky.dao.RoleInfoMapper;
import cn.dazky.pojo.RoleInfo;
import cn.dazky.service.RoleInfoSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/3 19:11
 */
@Service
public class RoleInfoSerivceImpl implements RoleInfoSerivce {

    @Resource
    RoleInfoMapper roleInfoMapper;

    @Override
    public List<RoleInfo> getAllRole() {
        return roleInfoMapper.selectByExample(null);
    }
}
