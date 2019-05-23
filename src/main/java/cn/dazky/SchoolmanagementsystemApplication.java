package cn.dazky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.dazky.dao")
public class SchoolmanagementsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolmanagementsystemApplication.class, args);
    }

}
