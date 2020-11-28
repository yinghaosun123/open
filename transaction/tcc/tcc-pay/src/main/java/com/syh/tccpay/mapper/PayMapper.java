package com.syh.tccpay.mapper;


import com.syh.api.pay.dto.PayDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayMapper {
    int descride(PayDTO payDTO);

    int confirm(PayDTO payDTO);

    int cancel(PayDTO payDTO);
}
