package com.syh.tccpay.service;

import com.syh.api.pay.api.PayService;
import com.syh.api.pay.dto.PayDTO;
import com.syh.tcc.common.association.TccTransaction;
import com.syh.tccpay.mapper.PayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;

    /**
     * @param payDTO
     * @return
     */
    @Override
    @TccTransaction(confirmMethod = "confirm", cancelMethod = "cancel")
    public Boolean decrease(PayDTO payDTO) {
        payDTO.setNowTime(System.currentTimeMillis());
        return payMapper.descride(payDTO) > 0 ? true : false;
    }


    public Boolean confirm(PayDTO payDTO) {
        payDTO.setNowTime(System.currentTimeMillis());
        return payMapper.confirm(payDTO) > 0 ? true : false;
    }


    public Boolean cancel(PayDTO payDTO) {
        payDTO.setNowTime(System.currentTimeMillis());
        return payMapper.cancel(payDTO) > 0 ? true : false;
    }

}
