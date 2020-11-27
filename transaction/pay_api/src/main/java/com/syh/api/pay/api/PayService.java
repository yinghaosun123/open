package com.syh.api.pay.api;

import com.syh.api.pay.model.Pay;

public interface PayService {

    Pay selectByPrimaryKey(Integer id);

    int insert(Pay pay);

    int updateByPrimaryKey(Integer id, double money, long nowTime);

}