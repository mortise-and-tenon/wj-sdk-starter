package fun.mortnon.wj.demo.service;

import fun.mortnon.wj.model.Survey;
import fun.mortnon.wj.model.WjPage;
import fun.mortnon.wj.service.WjManageService;
import fun.mortnon.wj.service.WjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Moon Wu
 * @date 2021/8/10
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private WjService wjService;

    @Autowired
    private WjManageService wjManageService;

    @Override
    public WjPage<Survey> getSurveyList(Long userId, Integer page, Integer perPage) {
        WjManageService wjManageService = wjService.getWjManageService();
        return wjManageService.listSurvey(userId,null,page,perPage);
    }

    @Override
    public WjPage<Survey> getSurveyList2(Long userId, Integer page, Integer perPage) {
        return wjManageService.listSurvey(userId,null,page,perPage);
    }
}
