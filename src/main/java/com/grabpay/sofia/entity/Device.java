package com.grabpay.sofia.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "device")
public class Device {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long phoneNo;
    private boolean isPrimary;
    private boolean status;
    private User user;

}
