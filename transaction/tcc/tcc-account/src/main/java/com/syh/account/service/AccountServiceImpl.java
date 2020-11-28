package com.syh.account.service;

import com.syh.account.client.PayClient;
import com.syh.account.mapper.AccountMapper;
import com.syh.api.account.api.AccountService;
import com.syh.api.account.dto.AccountDTO;
import com.syh.api.account.model.Account;
import com.syh.api.pay.dto.PayDTO;
import com.syh.tcc.common.association.TccTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private PayClient payClient;

    @Override
    public Account selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int insert(Account account) {
        return 0;
    }

    @Override
    @TccTransaction(confirmMethod = "confirm", cancelMethod = "cancel")
    public void operator(AccountDTO accountDTO) {
        accountDTO.setNowTime(System.currentTimeMillis());
        accountMapper.increase(accountDTO);
        PayDTO payDTO = new PayDTO(accountDTO.getUserId(), accountDTO.getMoney());
        payClient.decrease(payDTO);
    }

    /**
     * 确认支付成功
     *
     * @param accountDTO
     * @return
     */
    public boolean confirm(AccountDTO accountDTO) {
        accountDTO.setNowTime(System.currentTimeMillis());
        return accountMapper.confirm(accountDTO) > 0 ? true : false;
    }

    /**
     * 取消支付
     *
     * @param accountDTO
     * @return
     */
    public boolean cancel(AccountDTO accountDTO) {
        accountDTO.setNowTime(System.currentTimeMillis());
        return accountMapper.cancel(accountDTO) > 0 ? true : false;
    }
}
