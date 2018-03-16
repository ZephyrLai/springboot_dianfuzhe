package cn.zephyr.ch1.ch1_3_3;

import java.lang.annotation.*;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/16 14:05
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
@Documented
public @interface Action {
    String name();
}
