package cn.zephyr.ch1.ch1_3_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/16 14:17
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        UserService01 service01 = context.getBean(UserService01.class);
        UserService02 service02 = context.getBean(UserService02.class);
        service01.add();
        service02.add();
        context.close();
    }
}
