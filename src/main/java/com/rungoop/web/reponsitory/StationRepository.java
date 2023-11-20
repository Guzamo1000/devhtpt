package com.rungoop.web.reponsitory;

import com.rungoop.web.entity.Statistical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Station;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    @Query("select new com.rungoop.web.entity.Statistical(" +
            "ticket.ticketName," +
            "ticket.ticketPrice," +
            "ticket.discount," +
            "ticket.seatType," +
            "c.id," +
            "c.name," +
            "c.address," +
            "tr.id," +
            "tr.departureTime," +
            "tr.departureStation," +
            "tr.destination," +
            "u.id," +
            "u.fullName," +
            "u.role) " +
            "from Ticket ticket " +
            "join ticket.customerId c " +
            "join ticket.userId u " +
            "join ticket.trainRideId tr " +
            "join tr.station s " +
            "join tr.train t ")
    List<Statistical> search();
}
