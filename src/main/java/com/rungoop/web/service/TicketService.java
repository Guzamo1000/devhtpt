package com.rungoop.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Ticket;
@Service
public interface TicketService {
    List<Ticket> getAllTicket();

    Ticket saveTicket(Ticket ticket);

    Optional<Ticket> getTicketById(Long id);

    Ticket updateTicket(Ticket ticket);

    void deleteTicket(long id);
    
}
