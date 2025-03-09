package com.clear.project.mapper;

import com.clear.project.dto.CheckBalanceRequestDto;
import com.clear.project.dto.CheckBalanceResponseDto;
import com.clear.project.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Mapping(target = "accountNumber", source = "checkBalanceRequestDto.accountNumber")
    @Mapping(target = "accountName", source = "checkBalanceResponseDto.accountName")
    @Mapping(target = "accountBalance", source = "checkBalanceResponseDto.balance")
    AccountEntity dtoToAccountEntity(CheckBalanceRequestDto checkBalanceRequestDto, CheckBalanceResponseDto checkBalanceResponseDto);
}
