package cn.zephyr.ch2_5;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: Zephyr
 * @Description: 自定义事件，非Bean对象，在MyPublisher的publish中new一个
 * @Date: 2018/3/17 17:09
 */
public class UserEvent extends ApplicationEvent{
    private String msg;

    public UserEvent(Object source, String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
