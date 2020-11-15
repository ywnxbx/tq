package ltd.tianqi.tianqi.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@Data
public class TianqiResult {
    private String day;
    private Date date;
    private String week;
    private String wea;
    private String lowTem;
    private String HighTem;
    private String firstRain;
}
