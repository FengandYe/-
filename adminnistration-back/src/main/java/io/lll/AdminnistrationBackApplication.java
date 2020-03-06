package io.lll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.lll.dao")
public class AdminnistrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminnistrationBackApplication.class, args);
    }

}
