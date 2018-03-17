package cn.zephyr.ch3_3;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author: Zephyr
 * @Description:
 * @Date: 2018/3/17 19:14
 */
@Service
public class ScheduleService {

    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void schedule01(){
        System.out.println("Every 5 seconds "+format.format(new Date()));
    }

    @Scheduled(cron = "59 22 19 ? * *")
    public void schedule02(){
        System.out.println("execute at 19:22:59 "+format.format(new Date()));
    }
}
