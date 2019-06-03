package cn.dazky.service.Impl;

import cn.dazky.dao.RoleStatisticsMapper;
import cn.dazky.service.RoleStatisticsService;
import cn.dazky.vo.Cartogram;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/3 10:50
 */
@Service
public class RoleStatisticsServiceImpl implements RoleStatisticsService {

    @Resource
    RoleStatisticsMapper roleStatisticsMapper;

    @Override
    public List<Cartogram> getAll() {
        return roleStatisticsMapper.selectRoleCount();
    }
}
