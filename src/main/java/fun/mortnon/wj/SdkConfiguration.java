package fun.mortnon.wj;

import fun.mortnon.wj.service.*;
import fun.mortnon.wj.service.impl.WjDefaultStorageConfigImpl;
import fun.mortnon.wj.service.impl.WjServiceImpl;
import fun.mortnon.wj.service.impl.WjVendorServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Moon Wu
 * @date 2021/8/10
 */
@Configuration
public class SdkConfiguration {
    @Bean
    public WjStorageConfig wjStorageConfig() {
        return new WjDefaultStorageConfigImpl();
    }

    /**
     * 问卷 Service
     *
     * @param wjStorageConfig
     * @param wjAutoConfiguration
     * @return
     */
    @Bean
    public WjService wjService(WjStorageConfig wjStorageConfig, WjAutoConfiguration wjAutoConfiguration) {
        return new WjServiceImpl(wjStorageConfig, wjAutoConfiguration.getAppId(), wjAutoConfiguration.getAppSecret());
    }

    /**
     * 问卷管理 service
     * @param wjService
     * @return
     */
    @Bean
    public WjManageService wjManageService(WjService wjService) {
        return wjService.getWjManageService();
    }

    /**
     * 团队管理 service
     * @param wjService
     * @return
     */
    @Bean
    public WjAddressListService wjAddressListService(WjService wjService) {
        return wjService.getWjAddressListService();
    }

    /**
     * 数据推送管理 service
     * @param wjService
     * @return
     */
    @Bean
    public WjDataService wjDataService(WjService wjService){
        return wjService.getWjDataService();
    }

    /**
     * 第三方登录 service
     * @param wjService
     * @return
     */
    @Bean
    public WjVendorService wjVendorService(WjService wjService){
        return new WjVendorServiceImpl(wjService);
    }
}
