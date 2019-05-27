package cn.dazky.contorller;

import cn.dazky.pojo.NoticeInfo;
import cn.dazky.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Mr.chen
 * @2019-05-26 20:01
 */
@Controller
@RequestMapping("news")
public class NoticeController {
    @Autowired
    NoticeService noticeService;
    @RequestMapping(value = "/viewForNotice/{noticeId}",method = RequestMethod.GET)
    public String viewForNotice(@PathVariable Integer noticeId, Model model){
        System.out.println("要显示公告的公告id为"+noticeId);
        NoticeInfo notice=noticeService.getNoticeById(noticeId);
        System.out.println("notice中的");
        model.addAttribute("notice",notice);
        return "TheFrontDeskManagement/news/index-news";
    }
}
