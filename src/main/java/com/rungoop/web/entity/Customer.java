package com.rungoop.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private  Long Id;
    @Column(name="Name")
    private String name;
    @Column(name="account")
    private String account;
    @Column(name="password")
    private String password;
    @Column(name = "phoneNumber")
    private  String phoneNumber;
    @Column(name="Address")
    private  String address;
}
