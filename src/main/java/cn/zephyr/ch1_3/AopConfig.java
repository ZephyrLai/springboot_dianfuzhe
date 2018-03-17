package cn.zephyr.ch1_3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/16 14:18
 */
@Configuration
@ComponentScan(basePackages = "cn.zephyr.ch1.ch1_3")
@EnableAspectJAutoProxy //开启Spring对AspectJ代理的支持
public class AopConfig {
}
