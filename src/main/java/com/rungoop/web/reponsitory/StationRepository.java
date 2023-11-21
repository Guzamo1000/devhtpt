package com.rungoop.web.reponsitory;

// import com.rungoop.web.entity.Statistical;
import com.rungoop.web.entity.Statistical1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Station;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    @Query("select new com.rungoop.web.entity.Statistical1(" +
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
        "u.role," +
        "b.address) " + // Giả sử rằng Branch có trường branchName
        "from Ticket ticket " +
        "join ticket.customerId c " +
        "join ticket.userId u " +
        "join u.branchId b " + // Thêm join này
        "join ticket.trainRideId tr " +
        "join tr.station s " +
        "join tr.train t  ")
    List<Statistical1> joinTicketForSale();
    // @Query("select new com")
}
