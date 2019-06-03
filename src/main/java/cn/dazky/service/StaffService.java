package cn.dazky.service;

import cn.dazky.pojo.StaffInfo;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/5/28 19:03
 */
public interface StaffService {

    /**
     * 后台管理员登陆
     * @param user_number
     * @return
     */
    public StaffInfo login(String user_number);

    /**
     * 获取教师的人数
     * @return
     */
    Integer getStaffCount();
}
