package cn.zephyr.ch2_4;

import org.springframework.stereotype.Service;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 16:26
 */
public class UserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserService(String name) {
        this.name = name;
    }
}
