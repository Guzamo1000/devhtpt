package com.rungoop.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{
    
}