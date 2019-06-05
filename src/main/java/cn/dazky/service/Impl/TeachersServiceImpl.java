package cn.dazky.service.Impl;

import cn.dazky.dao.StaffInfoMapper;
import cn.dazky.pojo.StaffInfo;
import cn.dazky.service.TeachersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 教师信息管理实现类
 *
 * @author Mr.Zhong
 * @create2019-06-04 8:37
 */
@Service
public class TeachersServiceImpl implements TeachersService {

    @Resource
    StaffInfoMapper staffInfoMapper;

    /**
     *查询所有教师信息
     *
     * @return
     */
    public List<StaffInfo> StaffInfoList(){

        return staffInfoMapper.selectByExample(null);
    }


}
