package cn.dazky.service.Impl;

import cn.dazky.dao.ClassInfoMapper;
import cn.dazky.pojo.ClassInfo;
import cn.dazky.service.TheClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 班级信息管理实体类
 *
 * @author Mr.Zhong
 * @create2019-06-04 10:56
 */
@Service
public class TheClassServiceImpl implements TheClassService {

    @Resource
    ClassInfoMapper classInfoMapper;

    /**
     * 查询所有班级信息
     *
     * @return
     */
    public List<ClassInfo> ClassInfoList(){

        return classInfoMapper.selectByExample(null);
    }

}
