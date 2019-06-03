package cn.dazky.contorller;

import cn.dazky.pojo.DisciplineInfo;
import cn.dazky.service.Impl.CourseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * 课程信息Course
 *
 * @author Mr.Zhong
 * @create2019-05-28 9:30
 */
@Controller
public class CourseController {

    @Resource
    CourseServiceImpl courseService;

    /**
     * 查询所有课程信息
     *
     * @return
     */
    @RequestMapping(value="/selectByExample",method = RequestMethod.GET)
    public String selectByExample(Model model) {
        List<DisciplineInfo> disciplineInfoList = courseService.selectByExample();
        model.addAttribute("courseList",disciplineInfoList);

        return "text";
    }

}
