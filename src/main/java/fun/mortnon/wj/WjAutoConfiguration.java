package fun.mortnon.wj;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Moon Wu
 * @date 2021/8/10
 */
@Configuration
@ConfigurationProperties(prefix = "mortnon.wj")
@Data
public class WjAutoConfiguration {
    /**
     * Tencent wj app id
     */
    private String appId;

    /**
     * Tencent
     */
    private String appSecret;


}
