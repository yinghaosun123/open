package com.syh.xabussiness;

import com.syh.xabussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
