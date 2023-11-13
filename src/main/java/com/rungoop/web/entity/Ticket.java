package com.rungoop.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Tickets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name="ticketName")
    private String ticketName;
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
   

    

}
