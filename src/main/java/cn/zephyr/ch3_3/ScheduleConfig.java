package cn.zephyr.ch3_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 19:17
 */
@ComponentScan("cn.zephyr.ch3_3")
@Configuration
@EnableScheduling
public class ScheduleConfig {


}
