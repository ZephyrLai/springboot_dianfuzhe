package cn.zephyr.ch2_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 16:27
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("pre")
    public UserService preUserService(){
        return new UserService("This is PreUserService");
    }

    @Bean
    @Profile("sub")
    public UserService subUserService(){
        return  new UserService("This is SubUserService");
    }
}
