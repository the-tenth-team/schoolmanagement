package cn.dazky.service;

import cn.dazky.pojo.ClassroomInfo;

import java.util.List;

/**
 * 教室信息管理Service
 *
 * @author Mr.Zhong
 * @create2019-06-01 13:31
 */
public interface ClassService {
    /**
     * 查询所有教室信息
     *
     * @return
     */
    public List<ClassroomInfo> selectByExample();
}
