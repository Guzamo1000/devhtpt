package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Ticket")
@AllArgsConstructor
@NoArgsConstructor
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
    private User user;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="customerId")
    private Customer customer;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="trainRideId")
    private  TrainRide trainRide;
}
