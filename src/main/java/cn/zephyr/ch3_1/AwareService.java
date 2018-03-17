package cn.zephyr.ch3_1;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 17:55
 */
@Service
public class AwareService implements ResourceLoaderAware,BeanNameAware{
    private String name;
    private ResourceLoader loader;

    //实际的name值由Spring框架赋值
    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    //实际的Resource对象由Spring框架赋值
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
       this.loader = resourceLoader;
    }

    public void sout(){
        System.out.println("Bean name is "+name);

        Resource resource = loader.getResource("classpath:cn/zephyr/ch3_1/test.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
