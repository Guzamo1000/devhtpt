package com.rungoop.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.rungoop.web.entity.Account;
import com.rungoop.web.entity.Customer;
import com.rungoop.web.entity.User;
import com.rungoop.web.service.CustomerService;
import com.rungoop.web.service.UserService;

@Controller
@RequestMapping("/")
public class Train {
    // @Autowired
    private Account account;
    @Autowired
    private UserService userService;
    @Autowired
    private CustomerService customerService;
    @RequestMapping("")
    public String home()
    {
        return "home";
    }
    @GetMapping("/login")
    public String login(Model model){
        Account accountNew=new Account();
        model.addAttribute("account", accountNew);
        return "login";
    }
    @PostMapping("/login")
    public String login(Model model, @ModelAttribute("account") Account account, HttpSession session){
        User userlogin=userService.getUserById(userService.getUserByAccount(account.getAccount()));
        if(userlogin!=null){
            System.err.println("account: "+account.getPassword());
            System.err.println("userLogin: "+userlogin.getAccount());
            if(userlogin.getPassword().equals(account.getPassword()) ){
                session.setAttribute("currentUser", userlogin);
                return "redirect:/managerTicket/ticket";
            }
            
        }
        return null;
        
    }
}