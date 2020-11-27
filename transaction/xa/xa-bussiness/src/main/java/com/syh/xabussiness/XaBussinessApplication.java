package com.syh.xabussiness;

import com.syh.xabussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {JpaRepositoriesAutoConfiguration.class , DataSourceAutoConfiguration.class})
public class XaBussinessApplication implements CommandLineRunner {

    @Autowired
    private BussinessService bussinessService;

    public static void main(String[] args) {
        SpringApplication.run(XaBussinessApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        bussinessService.start();
    }
}
