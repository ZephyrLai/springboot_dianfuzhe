package cn.zephyr.ch3_2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 18:42
 */
@Service
public class TaskService {

    @Async
    public void task01(Integer i){
        System.out.println(new Date().getTime()+"  异步任务 "+i);
    }

    @Async
    public void task02(Integer i){
        System.out.println(new Date().getTime()+"  异步任务 1 -- "+(++i));

    }
}
