package com.rungoop.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Account{
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

    

    // public User(long id, String fullName, String account, String password, String role, String phoneNumber,
    //         Branch branchId) {
    //     this.id = id;
    //     this.fullName = fullName;
    //     this.account = account;
    //     this.password = password;
    //     this.role = role;
    //     this.phoneNumber = phoneNumber;
    //     this.branchId = branchId;
    // }
    

    // public User() {
    // }


    // public long getId() {
    //     return id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public String getFullName() {
    //     return fullName;
    // }

    // public void setFullName(String fullName) {
    //     this.fullName = fullName;
    // }

    // public String getAccount() {
    //     return account;
    // }

    // public void setAccount(String account) {
    //     this.account = account;
    // }

    // public String getPassword() {
    //     return password;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getRole() {
    //     return role;
    // }

    // public void setRole(String role) {
    //     this.role = role;
    // }

    // public String getPhoneNumber() {
    //     return phoneNumber;
    // }

    // public void setPhoneNumber(String phoneNumber) {
    //     this.phoneNumber = phoneNumber;
    // }

    // public Branch getBranchId() {
    //     return branchId;
    // }

    // public void setBranchId(Branch branchId) {
    //     this.branchId = branchId;
    // }


    
}
