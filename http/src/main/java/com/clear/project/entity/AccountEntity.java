package com.clear.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "account_number", nullable = false)
    private String accountNumber;
    @Column(name = "account_name", nullable = false)
    private String accountName;
    @Column(name = "account_balance", nullable = false)
    private long accountBalance;
}
