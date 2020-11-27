package com.syh.xabussiness.service.impl;

import com.syh.xabussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BussinessServiceImpl implements BussinessService {

    @Autowired
    @Qualifier(value = "jdbcTemplateA")
    private JdbcTemplate jdbcTemplateA;
    @Autowired
    @Qualifier(value = "jdbcTemplateB")
    private JdbcTemplate jdbcTemplateB;

    @Override
    public void start() {
        long nowTime = System.currentTimeMillis();
//        String name = jdbcTemplateA.queryForObject("select name from account where id = 1" , java.lang.String.class);
        jdbcTemplateA.execute("insert into account (name , money , create_time , update_time) values ('张三', 0    , "+ nowTime + ","+ nowTime + ")");
        int i = 1 / 0;
        jdbcTemplateB.execute("insert into pay (user_id , money , create_time , update_time) values (1, 100 , "+ nowTime + ","+ nowTime + ")");
    }
}
