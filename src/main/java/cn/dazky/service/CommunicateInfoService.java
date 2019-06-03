package cn.dazky.service;

import cn.dazky.pojo.CommunicateInfo;

import java.util.List;

/**
 * @author Zhike Chen
 * @date 2019/6/2
 **/
public interface CommunicateInfoService {
    /*查询所有班主任评价*/
    List<CommunicateInfo> getCommunicateInfoAll();
}
