package com.rungoop.web.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// import com.rungoop.web.entity.Statistical1;
import com.rungoop.web.entity.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{
    // @Query("SELECT t.id,t.ticket_name, t.ticket_price,t.discount,t.seat_type,c.id, c.name, c.address,tr.id,tr.departure_time,tr.departure_station, tr.destination,u.id, u.full_name,u.role from Customer c inner join Ticket t on c.id==t.customer_id INNER JOIN TrainRide tr ON t.train_rider_id=tr.id INNER JOIN User u ON t.user_id=u.id")    
    // List<Statistical> findStatis1();
}
