package cn.dazky.contorller;

import cn.dazky.pojo.RoleInfo;
import cn.dazky.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description: schoolmanagement
 * Created by 鹏 on 2019/6/1 11:21
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;


}
