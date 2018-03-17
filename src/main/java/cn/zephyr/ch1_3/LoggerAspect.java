package cn.zephyr.ch1_3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/16 14:11
 */
@Aspect     //声明为切面类
@Component  //声明为Bean
public class LoggerAspect {
    @Pointcut("@annotation(cn.zephyr.ch1_3.Action)")
    public void annotaionPointCut(){}

    //对于被@Action注解的方法有效
    @After("annotaionPointCut()")
    public void afterAdvice(){
        System.out.println("后置增强");
    }

    //对于cn.zephyr.ch1.ch1_3_3包中任意类中返回任意值的任意方法都有效
    @Before("execution(* cn.zephyr.ch1.ch1_3.*.*(..))")
    public void beforeAdvice(){
        System.out.println("前置增强");
    }
}
