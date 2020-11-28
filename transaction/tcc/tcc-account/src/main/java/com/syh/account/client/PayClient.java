package com.syh.account.client;


import com.syh.api.pay.dto.PayDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "pay-service")
public interface PayClient {
    /**
     * 支付金额
     *
     * @param dto
     * @return
     */
    @RequestMapping("/pay-service/pay/decrease")
    boolean decrease(PayDTO dto);

}
