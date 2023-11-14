package com.rungoop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Ticket;
import com.rungoop.web.reponsitory.TicketRepository;
import com.rungoop.web.service.TicketService;
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTicket() {
        // TODO Auto-generated method stub
        return ticketRepository.findAll();
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        // TODO Auto-generated method stub
       return ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(Long id) {
        // TODO Auto-generated method stub
        return ticketRepository.findById(id).get();
    }

    

    @Override
    public void deleteTicket(long id) {
        // TODO Auto-generated method stub
        ticketRepository.deleteById(id);
    }
    @Override
    public Ticket updateTicket(Ticket ticket) {
        // TODO Auto-generated method stub
        return ticketRepository.save(ticket);
    
    }

        
}
