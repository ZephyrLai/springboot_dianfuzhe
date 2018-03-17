package cn.zephyr.ch3_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 19:36
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public BaseService windowsService(){
        return new WindowsService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public BaseService LinuxService(){
        return new LinuxService();
    }
}
