package cn.zephyr.ch3_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 18:44
 */
public class TaskMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskService bean = context.getBean(TaskService.class);
        for (int i = 1; i <= 10 ; i++) {
            bean.task01(i);
            bean.task02(i);
        }
        context.close();

    }
}
