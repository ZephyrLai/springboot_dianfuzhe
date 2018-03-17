package cn.zephyr.ch2_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 15:56
 */
public class Main {
    public static void main(String[] args) {
        System.err.println("start to init...");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(InitDestoryConfig.class);
//        BeanService bean = context.getBean(BeanService.class);
//        JSR250Service jsr250 = context.getBean(JSR250Service.class);
        System.err.println("ready to destory...");
        context.close();

    }
}
