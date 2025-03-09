package com.clear.project.dto;

import lombok.Data;

@Data
public class CheckBalanceResponseDto {
    private long balance;
    private String accountName;
}
