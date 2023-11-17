package com.rungoop.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rungoop.web.entity.Ticket;
import com.rungoop.web.service.TicketService;


@Controller
@RequestMapping("/customer")
public class CustomerView {
    @Autowired
    private TicketService ticketService;
    @GetMapping(value="ticket")
    public String getAllTicke(Model model) {
        List<Ticket> listTicket =ticketService.getAllTicket();
        model.addAttribute("listTicket", listTicket);
        return "customer/ticket";
    }
    
}
