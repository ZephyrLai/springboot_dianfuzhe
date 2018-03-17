package cn.zephyr.ch2_3;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 15:42
 */
public class BeanService {
    public void init(){
        System.out.println("@Bean init service");
    }

    public BeanService() {
        System.out.println("This is BeanService");
    }

    public void destory(){
        System.out.println("@Bean destory service");
    }
}
