package com.rungoop.web.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistical {
    private String ticketName;
    private Double ticketPrice;
    private Double discount;
    private String seatType;
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private Long trainRideId;
    private LocalDateTime trainRiderDepatureTime;
    private String trainRiderDepartureStation;
    private String trainRiderDestination;
    private Long userId;
    private String userFullName;
    private String userRole;
}
