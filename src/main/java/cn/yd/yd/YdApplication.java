package cn.yd.yd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.yd.yd.dao")
public class YdApplication {

    public static void main(String[] args) {
        SpringApplication.run(YdApplication.class, args);
    }

}
