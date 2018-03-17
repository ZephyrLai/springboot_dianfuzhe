package cn.zephyr.ch2_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 17:12
 */
@Component
public class MyPublisher {
    @Autowired
    private ApplicationContext context;

    public void publish(String msg){
        context.publishEvent(new UserEvent(this,msg));
    }
}
