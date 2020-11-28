package com.syh.api.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    public AccountDTO(Integer userId , double money){
        this.userId = userId;
        this.money = money;
    }

    private Integer userId;
    private double money;
    private Long nowTime;
}
