package com.rungoop.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private  long id;
    @Column(name="fullName")
    private  String fullName;
    @Column(name="account")
    private String account;
    @Column(name="password")
    private String password;
    @Column(name= "role")
    private  String role;

    @Column(name="phoneNumber")
    private  String phoneNumber;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "branchId")
    private Branch branchId;

}
