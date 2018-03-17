package cn.zephyr.ch2_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 16:29
 */
public class ProfileMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("pre");
        context.getEnvironment().setActiveProfiles("sub");
        context.register(ProfileConfig.class);
        context.refresh();
        UserService userService01 = context.getBean(UserService.class);
        System.out.println(userService01.getName());


        context.close();
    }

}
