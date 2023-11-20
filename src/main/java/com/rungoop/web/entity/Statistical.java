package com.rungoop.web.entity;

import java.time.LocalDateTime;

public class Statistical {
    protected Long id;
    protected String name;
    protected double ticket_price;
    protected double discount;
    protected String seat_type;
    protected Long customerId;
    protected String customerName;
    protected String customerAddress;
    protected String trainRideId;
    protected LocalDateTime trainRiderDepatureTime;
    protected String trainRiderDepartureStation;
    protected String trainRiderdestination;
    protected Long userId;
    protected String userFullName;
    protected String userRole;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTicket_price() {
        return ticket_price;
    }
    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getSeat_type() {
        return seat_type;
    }
    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getTrainRideId() {
        return trainRideId;
    }
    public void setTrainRideId(String trainRideId) {
        this.trainRideId = trainRideId;
    }
    public LocalDateTime getTrainRiderDepatureTime() {
        return trainRiderDepatureTime;
    }
    public void setTrainRiderDepatureTime(LocalDateTime trainRiderDepatureTime) {
        this.trainRiderDepatureTime = trainRiderDepatureTime;
    }
    public String getTrainRiderDepartureStation() {
        return trainRiderDepartureStation;
    }
    public void setTrainRiderDepartureStation(String trainRiderDepartureStation) {
        this.trainRiderDepartureStation = trainRiderDepartureStation;
    }
    public String getTrainRiderdestination() {
        return trainRiderdestination;
    }
    public void setTrainRiderdestination(String trainRiderdestination) {
        this.trainRiderdestination = trainRiderdestination;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserFullName() {
        return userFullName;
    }
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public Statistical(Long id, String name, double ticket_price, double discount, String seat_type, Long customerId,
            String customerName, String customerAddress, String trainRideId, LocalDateTime trainRiderDepatureTime,
            String trainRiderDepartureStation, String trainRiderdestination, Long userId, String userFullName,
            String userRole) {
        this.id = id;
        this.name = name;
        this.ticket_price = ticket_price;
        this.discount = discount;
        this.seat_type = seat_type;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.trainRideId = trainRideId;
        this.trainRiderDepatureTime = trainRiderDepatureTime;
        this.trainRiderDepartureStation = trainRiderDepartureStation;
        this.trainRiderdestination = trainRiderdestination;
        this.userId = userId;
        this.userFullName = userFullName;
        this.userRole = userRole;
    }
    public Statistical() {
    }
    
}
