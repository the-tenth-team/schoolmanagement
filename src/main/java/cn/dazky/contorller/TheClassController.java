package cn.dazky.contorller;

import cn.dazky.pojo.ClassInfo;
import cn.dazky.service.TheClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 班级信息管理Controller
 *
 * @author Mr.Zhong
 * @create2019-06-04 11:06
 */
@Controller
public class TheClassController {

    @Autowired
    TheClassService theClassService;

    /**
     * 跳转到班级信息管理页面
     *
     * @return
     */
    @RequestMapping("/staff/ToClassInfoList")
    public String ToDisciplineInfoList() {
        return "BackgroundManagement/management/TheClass";
    }

    /**
     * 查询所有班级信息
     *
     * @return
     */
    @RequestMapping("/ClassInfoList")
    @ResponseBody
    public Map<String, Object> ClassInfoList(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();

        PageHelper.startPage(Integer.valueOf(request.getParameter("page")), Integer.valueOf(request.getParameter("limit")));
        List<ClassInfo> classInfoList = theClassService.ClassInfoList();
        PageInfo<ClassInfo> pageInfo = new PageInfo<>(classInfoList);

        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());  //总记录数
        map.put("data", pageInfo.getList());    //结果集
        return map;
    }


}
