package com.clear.project.controller;

import com.clear.project.dto.CheckBalanceRequestDto;
import com.clear.project.dto.CheckBalanceResponseDto;
import com.clear.project.service.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0")
@RequiredArgsConstructor
public class CheckBalance {
    private final Account account;

    @GetMapping("/check-balance/{id}")
    public CheckBalanceResponseDto checkBalance(
            @RequestHeader("Authorization") String authorization,
            @PathVariable("id") String id
    ) {
        CheckBalanceRequestDto checkBalanceRequestDto = new CheckBalanceRequestDto();
        checkBalanceRequestDto.setAccountNumber(id);
        return account.getAccountBalance(checkBalanceRequestDto);
    }
}
