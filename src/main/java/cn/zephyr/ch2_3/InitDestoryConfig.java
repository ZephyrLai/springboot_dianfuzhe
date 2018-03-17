package cn.zephyr.ch2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 15:54
 */
@Configuration
public class InitDestoryConfig {

    //指定BeanService类中的init、destory方法
    @Bean(initMethod = "init",destroyMethod = "destory")
    public BeanService beanService(){
        return new BeanService();
    }

    @Bean
    public JSR250Service jsr250Service(){
        return new JSR250Service();
    }
}

