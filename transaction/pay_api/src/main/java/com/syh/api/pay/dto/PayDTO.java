package com.syh.api.pay.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 扣钱传输的对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO {

    public PayDTO(Integer userId , double money){
        this.userId = userId;
        this.money = money;
    }

    private Integer userId;
    private double money;
    private Long nowTime;
}
