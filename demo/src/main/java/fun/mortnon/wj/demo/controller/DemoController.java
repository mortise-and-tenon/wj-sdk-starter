package fun.mortnon.wj.demo.controller;

import fun.mortnon.wj.demo.service.DemoService;
import fun.mortnon.wj.model.Survey;
import fun.mortnon.wj.model.WjPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Moon Wu
 * @date 2021/8/10
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/survey")
    public WjPage<Survey> getSurveyList(){
        Long userId = 1L;
        Integer page = 1;
        Integer perPage = 20;
        return demoService.getSurveyList(userId,page,perPage);
    }

    @RequestMapping(value = "/survey2")
    public WjPage<Survey> getSurveyList2(){
        Long userId = 1L;
        Integer page = 1;
        Integer perPage = 20;
        return demoService.getSurveyList(userId,page,perPage);
    }
}
