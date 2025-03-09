package com.clear.project.service;

import com.clear.project.dto.CheckBalanceRequestDto;
import com.clear.project.dto.CheckBalanceResponseDto;

public interface Account {
    CheckBalanceResponseDto getAccountBalance(CheckBalanceRequestDto checkBalanceRequestDto);
}
