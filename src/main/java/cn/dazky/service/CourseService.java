package cn.dazky.service;

import cn.dazky.pojo.DisciplineInfo;

import java.util.List;

/**
 * 课程信息Service
 *
 * @author Mr.Zhong
 * @create2019-05-28 9:32
 */
public interface CourseService {

    /**
     * 查询所有课程信息
     *
     * @return
     */
    public List<DisciplineInfo> selectByExample();

}
