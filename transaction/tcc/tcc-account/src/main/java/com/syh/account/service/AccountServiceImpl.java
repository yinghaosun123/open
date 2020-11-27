package com.syh.account.service;

import com.syh.api.account.api.AccountService;
import com.syh.api.account.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Account selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int insert(Account account) {
        return 0;
    }
}
