package com.rungoop.web.entity;

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
@Table(name="TrainRides")
public class TrainRide {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;
    @Column(name = "departureTime")
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
    private LocalDateTime departureTime;
    // @Column(name="departureStation")
    // private String departureStation;

    @Column(name="seat1_availability")
    private Integer seat1Availability;
    @Column(name="seat2_availability")
    private Integer seat2Availability;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="departure_station_id")
    private Station station;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "destination_station_id")
    private Station destination;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="trainId")
    private Train train;

}
