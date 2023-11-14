package com.rungoop.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="stations")
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
