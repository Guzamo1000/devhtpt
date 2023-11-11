package com.rungoop.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Trains")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="manufacturing")
    private  String manufacturing;
    @Column(name="class1Seats")
    private Integer class1Seats;
    @Column(name="class2Seats")
    private Integer class2Seat;
}
