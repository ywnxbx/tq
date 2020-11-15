package ltd.tianqi;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TianqiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianqiApplication.class, args);

    }

}
