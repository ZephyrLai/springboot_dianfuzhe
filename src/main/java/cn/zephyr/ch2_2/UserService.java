package cn.zephyr.ch2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: Zephyr
 * @Description:  本类将在SpringEL类中注入
 * @Date: 2018/3/17 15:00
 */
@Service("hahaService")
public class UserService {
    @Value("哈哈哈用户服务？不存在的。")
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
