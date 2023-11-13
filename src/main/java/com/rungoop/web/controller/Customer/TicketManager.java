package com.rungoop.web.controller.Customer;

import com.rungoop.web.entity.Customer;
import com.rungoop.web.entity.Ticket;
import com.rungoop.web.entity.TrainRide;
import com.rungoop.web.entity.User;
import com.rungoop.web.service.CustomerService;
import com.rungoop.web.service.TicketService;
import com.rungoop.web.service.TrainRidesService;
import com.rungoop.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/managerTicket")
public class TicketManager {
    @Autowired
    private TicketService ticketService;
    @Autowired
    private UserService userService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TrainRidesService trainRidesService;

    @GetMapping("/ticket")
    public String getAllTicket(Model model) {
        model.addAttribute("tickets", ticketService.getAllTicket());
        return "user/ticketManager";
    }

    @GetMapping("/newTicket")
    public String newTicket(Model model) {
        Ticket ticket = new Ticket();
        model.addAttribute("tickets", ticket);

        List<User> listUser = userService.getAllUser();
        model.addAttribute("listUser", listUser);

        List<Customer> listCustomers = customerService.getAllCustomers();
        model.addAttribute("listCustomer", listCustomers);

        List<TrainRide> listTrainRide = trainRidesService.getAllTrainRides();
        model.addAttribute("listTrainRide", listTrainRide);
        return "user/ticketCreate";

    }
    @PostMapping(value="/createTicket")
    public String createTicket(@ModelAttribute("ticket") Ticket ticket) {
        
        //TODO: process POST request
        ticketService.saveTicket(ticket);
        return "redirect:/managerTicket/ticket";
    }
    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
        return "redirect:/managerTicket/ticket";
    }
}
