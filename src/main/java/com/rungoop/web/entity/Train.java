package com.rungoop.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="trains")
public class Train {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="manufacturing")
    private  String manufacturing;
    @Column(name="class1seats")
    private Integer class1Seats;
    @Column(name="class2seats")
    private Integer class2Seats;


    

}
