package cn.zephyr.ch2_5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 17:11
 */
@Component
public class MyListener implements ApplicationListener<UserEvent> {

    public void onApplicationEvent(UserEvent userEvent) {
        System.out.println("Listerner get msg: "+userEvent.getMsg());
    }
}
