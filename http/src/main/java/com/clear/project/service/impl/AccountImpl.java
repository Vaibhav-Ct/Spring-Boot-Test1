package com.clear.project.service.impl;

import com.clear.project.dto.CheckBalanceRequestDto;
import com.clear.project.dto.CheckBalanceResponseDto;
import com.clear.project.entity.AccountEntity;
import com.clear.project.mapper.AccountMapper;
import com.clear.project.repository.AccountRepository;
import com.clear.project.service.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountImpl implements Account {
    private final AccountMapper mapper;
    private final AccountRepository accountRepository;

    @Override
    public CheckBalanceResponseDto getAccountBalance(CheckBalanceRequestDto checkBalanceRequestDto) {
        CheckBalanceResponseDto checkBalanceResponseDto = new CheckBalanceResponseDto();
        checkBalanceResponseDto.setAccountName("John Doe");
        checkBalanceResponseDto.setBalance(1000);
        AccountEntity accountEntity =  mapper.dtoToAccountEntity(checkBalanceRequestDto, checkBalanceResponseDto);
        accountRepository.save(accountEntity);
        return checkBalanceResponseDto;
    }
}
