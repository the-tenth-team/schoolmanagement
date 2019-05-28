package cn.dazky.service.Impl;

import cn.dazky.dao.CommunicateInfoMapper;
import cn.dazky.pojo.CommunicateInfo;
import cn.dazky.service.CommunicateInfoService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CommunicateInfoServiceImpl
 * @Description TODO
 * @Auther Google
 * @Date 2019/5/24 19:14
 * @Version 1.0
 */
@Service
public class CommunicateInfoServiceImpl implements CommunicateInfoService {
    @Resource
    CommunicateInfoMapper communicateInfoMapper;
    /*查询所有班主任评价*/
    @Override
    public List<CommunicateInfo> findCommunicateInfoAll() {
        return communicateInfoMapper.selectByExample(null);
    }
}
