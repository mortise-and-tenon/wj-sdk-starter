package fun.mortnon.wj.demo.service;

import fun.mortnon.wj.model.Survey;
import fun.mortnon.wj.model.WjPage;
import org.springframework.stereotype.Service;

/**
 * @author Moon Wu
 * @date 2021/8/10
 */
public interface DemoService {
    /**
     * 获取问卷列表，使用公共类获取服务类对象
     */
    WjPage<Survey> getSurveyList(Long userId, Integer page, Integer perPage);

    /**
     * 获取问卷列表方法2，直接使用服务类的对象
     */
    WjPage<Survey> getSurveyList2(Long userId, Integer page, Integer perPage);
}
