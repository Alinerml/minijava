package com.aliner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author aliner
 * @date 2023/12/20 21:56
 */

@MapperScan("com.aliner.mapper")
@SpringBootApplication
public class MinijavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MinijavaApplication.class,args);
    }
}
