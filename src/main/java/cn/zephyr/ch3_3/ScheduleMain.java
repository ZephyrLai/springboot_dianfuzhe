package cn.zephyr.ch3_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 19:18
 */
public class ScheduleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScheduleConfig.class);
    }
}
