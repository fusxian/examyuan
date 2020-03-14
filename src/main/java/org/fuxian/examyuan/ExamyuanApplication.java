package org.fuxian.examyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.fuxian.examyuan.dao")
public class ExamyuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamyuanApplication.class, args);
    }

}
