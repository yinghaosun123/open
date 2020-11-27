package com.syh.tccpay.service;

import com.syh.api.pay.api.PayService;
import com.syh.api.pay.model.Pay;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Override
    public Pay selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int insert(Pay pay) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Integer id, double money, long nowTime) {
        return 0;
    }
}
