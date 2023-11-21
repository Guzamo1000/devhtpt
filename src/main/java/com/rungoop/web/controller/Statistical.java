package com.rungoop.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rungoop.web.entity.Statistical2;
import com.rungoop.web.reponsitory.BranchRepository;
import com.rungoop.web.reponsitory.BranchRepository.static2;
import com.rungoop.web.reponsitory.StationRepository;
import com.rungoop.web.service.StationService;

@Controller
@RequestMapping("/statistical")
public class Statistical {
    @Autowired
    private StationRepository stationRepository;
    @Autowired
    private BranchRepository branchRepository;

    @GetMapping("/ticketsForSale")
    public String ticketForSale(Model model){
        List<com.rungoop.web.entity.Statistical1> statis=stationRepository.joinTicketForSale();
        model.addAttribute("statis1",statis);
        return "/user/statistical1";
    }
    @GetMapping("/ticketAndQuanlity")
    public String ticketAndQuanlity(Model model)
    {
        List<static2> statis=branchRepository.getTicketAndMoney();
        
        System.out.println("statis" + statis);
        model.addAttribute("statis", statis);
        return "user/statistical2";
    }
}
