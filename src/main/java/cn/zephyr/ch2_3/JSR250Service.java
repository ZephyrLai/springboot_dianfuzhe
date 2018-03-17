package cn.zephyr.ch2_3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 15:45
 */
public class JSR250Service {

    @PostConstruct//在当前构造方法调用后执行
    public void init(){
        System.out.println("jsr250 init service");
    }

    public JSR250Service() {
        System.out.println("This is jsr250Service");
    }

    @PreDestroy//在当前对象销毁之前执行
    public void destory(){
        System.out.println("jsr250 destory service");
    }
}
