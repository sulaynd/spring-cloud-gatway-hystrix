package com.javatechie.cloud.gateway.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private String order;
    private double amount;
    private String transactionId;
    private String message;
}
