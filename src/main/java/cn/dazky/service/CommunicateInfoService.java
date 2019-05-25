package cn.dazky.service;

import cn.dazky.pojo.CommunicateInfo;

import java.util.List;

public interface CommunicateInfoService {
    /*查询所有班主任评价*/
    public List<CommunicateInfo> findCommunicateInfoAll();
}
