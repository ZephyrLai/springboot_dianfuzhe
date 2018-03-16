package cn.zephyr.ch1.ch1_3_3;

import org.springframework.stereotype.Service;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/16 14:08
 */
@Service
public class UserService01 {

    @Action(name="拦截01中的add方法")
    public void add(){
        System.out.println("这里是UserService01中的add方法");
    }
}
