package com.rungoop.web.controller.user;

import com.rungoop.web.entity.Account;
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

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



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
        // User currentUser=(User) session.getAttribute("currentUser");
        // System.err.println("currentUser ROLE: "+currentUser.getRole());
        // if(currentUser.getRole()!="2" || currentUser.getRole()==null){
        //     Account accountNew=new Account();
        //     model.addAttribute("account", accountNew);
        //     return "redirect:/login";
            
        // }
        // else{
            model.addAttribute("tickets", ticketService.getAllTicket());

            return "user/ticketManager";
        // }
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
    @GetMapping(value="/editTicket/{id}")
    public String editTicket(@PathVariable long id, Model model) {
        Ticket ticket=ticketService.getTicketById(id);
        model.addAttribute("ticket", ticket );
        List<User> listUser = userService.getAllUser();
        model.addAttribute("listUser", listUser);

        List<Customer> listCustomers = customerService.getAllCustomers();
        model.addAttribute("listCustomer", listCustomers);

        List<TrainRide> listTrainRide = trainRidesService.getAllTrainRides();
        model.addAttribute("listTrainRide", listTrainRide);
        return "user/ticketEdit";
    }
    @PostMapping("/editTicket/{id}")
    public String editTicket(@PathVariable long id, @ModelAttribute("ticket") Ticket ticket, Model model){
        Ticket ticketupdate=ticketService.getTicketById(id);
        ticketupdate.setId(id);
        ticketupdate.setTicketName(ticket.getTicketName());
        ticketupdate.setDiscount(ticket.getDiscount());
        ticketupdate.setSeatType(ticket.getSeatType());
        ticketupdate.setUserId(ticket.getUserId());
        ticketupdate.setCustomerId(ticket.getCustomerId());
        ticketupdate.setTrainRideId(ticket.getTrainRideId());
        ticketService.updateTicket(ticketupdate);
        return "redirect:/managerTicket/ticket";
    }
}
