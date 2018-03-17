package cn.zephyr.ch2_2;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 14:48
 */
@Configuration
@ComponentScan("cn.zephyr.ch2_2")
@PropertySource("classpath:cn/zephyr/ch2_2/config.properties")
public class SpringEL {
    //注入字符串
    @Value("This SpringFramework")
    private String phrase;

    //注入操作系统名称
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //注入表达式结果（随机浮点数）
    @Value("#{ T(java.lang.Math).random()*100.0}")
    private Double randomNum;

    //注入Bean
    @Value("#{hahaService.serviceName}")
    private String serviceName;

    @Value("classpath:cn/zephyr/ch2_2/test.txt")
    private Resource testFile;

    @Value("http://www.laizonghao.cn:8080")
    private Resource url;

    @Value("${haha.name}")
    private String hahaName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void sout(){
        try {
            System.out.println(phrase);
            System.out.println(osName);
            System.out.println(randomNum);
            System.out.println(serviceName);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));

            System.out.println(hahaName);
            System.out.println(new String(environment.getProperty("hehe.msg").getBytes("ISO-8859-1")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringEL.class);
        SpringEL el = context.getBean(SpringEL.class);
        el.sout();
        context.close();
    }
}











