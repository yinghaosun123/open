package com.syh.api.account.api;

import com.syh.api.account.model.Account;

public interface AccountService  {

    Account selectByPrimaryKey(Integer id);

    int insert(Account account);

}
