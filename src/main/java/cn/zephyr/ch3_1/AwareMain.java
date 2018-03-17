package cn.zephyr.ch3_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 18:01
 */
public class AwareMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.sout();
    }
}
