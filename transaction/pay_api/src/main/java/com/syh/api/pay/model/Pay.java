package com.syh.api.pay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pay {
    private Integer id;
    private Double money;
    private Integer userId;
    private Long createTime;
    private Long updateTime;
    private Long lastTime;
}
