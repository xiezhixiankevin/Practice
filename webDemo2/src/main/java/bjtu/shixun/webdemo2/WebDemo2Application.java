package bjtu.shixun.webdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"bjtu.shixun.webdemo2.mapper"})
public class WebDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(WebDemo2Application.class, args);
    }

}
