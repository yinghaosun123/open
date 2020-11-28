package com.syh.account.mapper;


import com.syh.api.account.dto.AccountDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    int cancel(AccountDTO accountDTO);

    int confirm(AccountDTO accountDTO);

    void increase(AccountDTO accountDTO);
}
