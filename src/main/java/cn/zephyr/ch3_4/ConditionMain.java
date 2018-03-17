package cn.zephyr.ch3_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 19:38
 */
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        //多态
        BaseService bean = context.getBean(BaseService.class);
        System.out.println(bean.getOS());

    }
}
