package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="station")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Station {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="address")
    private String address;
    @Column(name="trainStationClass")
    private String trainStationClass;
}
