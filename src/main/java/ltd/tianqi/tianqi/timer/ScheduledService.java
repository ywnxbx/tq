package ltd.tianqi.tianqi.timer;


import lombok.extern.slf4j.Slf4j;
import ltd.tianqi.tianqi.pojo.TianqiResult;
import ltd.tianqi.tianqi.service.TianqiService;
import ltd.tianqi.tianqi.service.TianqiServiceImpl;
import ltd.tianqi.tianqi.txysender.SendSMSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;


@Slf4j
@Component
public class ScheduledService {
    //@Scheduled(cron = "*/30 * * * * ?")
    @Scheduled(cron = "0 20 6,18 * * ?")
    public void scheduled(){
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yy:mm:dd");
        TianqiResult result = new TianqiServiceImpl().queryTianqi("101210106");
        if (null == result){
            System.out.println("======================   明天没有雨  ===============");
            log.info("======================   明天没有雨  ===============");
        }else{
            //String dateStr = dateFormat.format(result.getDate());
            String msgDate = result.getWeek()+result.getFirstRain();
            String msgWea = result.getWea()+" "+result.getLowTem() +"~"+ result.getHighTem();
            String msgRem = "亲爱哒出门记得带伞哦~";
            System.out.println(msgDate+msgWea+msgRem);
            new SendSMSUtils().sender(msgDate,msgWea,msgRem);
            log.info("预计有雨，短信已发送  ====  "+msgDate+msgWea+msgRem);
        }
    }
}
