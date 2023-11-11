package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Customer")
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

    @Column(name = "phoneNumber")
    private  String phoneNumber;
    @Column(name="Address")
    private  String address;
}
