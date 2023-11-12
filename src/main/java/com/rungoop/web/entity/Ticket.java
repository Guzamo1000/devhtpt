package com.rungoop.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name="ticketPrice")
    private float ticketPrice;
    @Column(name="discount")
    private float discount;

    @Column(name="seatType")
    private  String seatType;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="userId")
    private User userId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="customerId")
    private Customer customerId;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="trainRideId")
    private  TrainRide trainRideId;



    
    public Ticket(Long id, float ticketPrice, float discount, String seatType, User userId, Customer customerId,
            TrainRide trainRideId) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.discount = discount;
        this.seatType = seatType;
        this.userId = userId;
        this.customerId = customerId;
        this.trainRideId = trainRideId;
    }
    
    public Ticket() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    public String getSeatType() {
        return seatType;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
    public Customer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
    public TrainRide getTrainRideId() {
        return trainRideId;
    }
    public void setTrainRideId(TrainRide trainRideId) {
        this.trainRideId = trainRideId;
    }
    
    

    
}
