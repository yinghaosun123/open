package com.syh.xabussiness.service.impl;

import com.syh.xabussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BussinessServiceImpl implements BussinessService {

    @Autowired
    private JdbcTemplate jdbcTemplateA;
    @Autowired
    private JdbcTemplate jdbcTemplateB;

    @Override
    public void start() {
        long nowTime = System.currentTimeMillis();
        jdbcTemplateA.execute("insert into account (name , money , create_time , update_time) values ('张三', 0    , "+ nowTime + ","+ nowTime + ")");
        int i = 1 / 0;
        jdbcTemplateB.execute("insert into pay (user_id , money , create_time , update_time) values (1, 100 , "+ nowTime + ","+ nowTime + ")");
    }
}
