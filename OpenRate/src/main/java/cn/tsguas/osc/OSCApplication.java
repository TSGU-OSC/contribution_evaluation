package cn.tsguas.osc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.tsguas.osc.mapper")
@SpringBootApplication
public class OSCApplication {

    public static void main(String[] args) {
        SpringApplication.run(OSCApplication.class, args);
    }

}
