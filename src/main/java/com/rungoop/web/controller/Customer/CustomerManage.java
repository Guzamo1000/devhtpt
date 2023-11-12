package com.rungoop.web.controller.Customer;

import com.rungoop.web.entity.Branch;
import com.rungoop.web.entity.Customer;
import com.rungoop.web.entity.Ticket;
import com.rungoop.web.service.BranchService;
import com.rungoop.web.service.CustomerService;
import com.rungoop.web.service.TicketService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/managerCustomer")
public class CustomerManage {
    @Autowired
    private  CustomerService customerService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private TicketService ticketService;

    @GetMapping("/customer")
    public String getAllCustomer(Model model){
        model.addAttribute("customer", customerService.getAllCustomers());

        return "user/customerManage";
    }
    @GetMapping("/newCustomer")
    public  String newCustomer(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer",customer);

        List<Ticket> listTickets=ticketService.getAllTicket();
        model.addAttribute("listbranch", listTickets);
        return "user/customerCreate";
    }
    @GetMapping("/customer/{id}")
    public String deleteCustome(@PathVariable Long id)
    {
        customerService.deleteCustomer(id);
        return "redirect:/managerCustomer/customer";
    }
    @GetMapping("/editCustomer/{id}")
    public String editCustomer(@PathVariable Long id, Model model)
    {
        System.out.println("id"+ id);
        model.addAttribute("customer", customerService.getCustomerById(id));
        // List<Ticket> listTicket=ticketService.getAllTicket();
        // model.addAttribute("listTicket", listTicket);
        return "user/customerEdit";
    }
    @PostMapping("/editCustomer/{id}")
    public String updatetCustomer(@PathVariable Long id, @ModelAttribute("customer") Customer customer, Model model){
        Customer customerupdate=customerService.getCustomerById(id);
        customerupdate.setId(id);
        customerupdate.setName(customer.getName());
        customerupdate.setAccount(customer.getAccount());
        customerupdate.setPassword(customer.getPassword());
        customerupdate.setPhoneNumber(customer.getPhoneNumber());
        customerupdate.setAddress(customer.getAddress());;
        customerService.updaCustomer(customerupdate);
        return "redirect:/managerCustomer/customer";
    }
    @PostMapping(value="/customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        String name=customer.getName();
        customer.setPassword(name);
        //TODO: process POST @ModelAttribute;
        customerService.saveCustomer(customer);
        return "redirect:/managerCustomer/customer";
    }
    
    
}
