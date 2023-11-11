package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Branch")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Branch {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private  long id;
    @Column(name="address")
    private  String address;
    @Column(name="PhoneNumber")
    private String phoneNumber;

}
