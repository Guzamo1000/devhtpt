package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TrainRide")
public class TrainRide {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;
    @Column(name = "departureTime")
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
    private LocalDateTime departureTime;
    @Column(name="departureStation")
    private String departureStation;
    @Column(name = "Destination")
    private String destination;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="trainRideId")
    private TrainRide trainRide;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="station")
    private Station station;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="trainId")
    private Train train;

}
