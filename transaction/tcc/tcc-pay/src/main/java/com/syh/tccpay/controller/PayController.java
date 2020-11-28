package com.syh.tccpay.controller;

import com.syh.api.pay.api.PayService;
import com.syh.api.pay.dto.PayDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping(name = "/decrease", method = RequestMethod.POST)
    public Boolean decrease(PayDTO payDTO) {
        return payService.decrease(payDTO);
    }


}
