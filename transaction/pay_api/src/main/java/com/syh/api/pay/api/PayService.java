package com.syh.api.pay.api;

import com.syh.api.pay.dto.PayDTO;

public interface PayService {

    Boolean decrease(PayDTO payDTO);
}