package com.grabpay.sofia.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long customerOtp;
    private Long merchantOtp;
    private Long customerId;
    private Long merchantId;
    private UUID utr;
    private Double amount;
}
