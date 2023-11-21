package com.rungoop.web.controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rungoop.web.entity.Account;
import com.rungoop.web.entity.Station;
import com.rungoop.web.entity.Ticket;
import com.rungoop.web.entity.Train;
import com.rungoop.web.entity.TrainRide;
import com.rungoop.web.entity.User;
import com.rungoop.web.service.StationService;
import com.rungoop.web.service.TrainRidesService;
import com.rungoop.web.service.TrainService;

@Controller
@RequestMapping("/managerTrainRide")
public class TrainRideManage {
    @Autowired
    private StationService stationService;
    @Autowired
    private TrainRidesService trainRidesService;
    @Autowired
    private TrainService trainService;

    @GetMapping("/trainride")
    public String viewTrainRide(Model model, HttpSession session){
        // User currentUser=(User) session.getAttribute("currentUser");
        
        // System.out.println("id current USER: "+ currentUser.getRole());
        // // if(currentUser.getRole()!="2"){
        //     Account accountNew=new Account();
        //     model.addAttribute("account", accountNew);
        //     return "redirect:/login";
        // }
        // else{
            model.addAttribute("trainride",trainRidesService.getAllTrainRides());
            // List<Station> listStation=stationService.getAllStation();
            // model.addAttribute("listStation", listStation);
            return "user/trainrideManager";
        // }
    }
    @GetMapping("/editTrainRide/{id}")
    public String editTrainRide(@PathVariable long id, Model model){
        TrainRide trainride=trainRidesService.getTrainRideById(id);
        model.addAttribute("trainride", trainride);
        List<Station> listStation=stationService.getAllStation();
        model.addAttribute("listStation", listStation);
        List<Train> listTrain=trainService.getAllTrains();
        model.addAttribute("listTrain", listTrain);
        return "user/trainrideEdit";
    }
    @GetMapping("/createTrainRide")
    public String createTrainRide(Model model){
        TrainRide trainRide=new TrainRide();
        model.addAttribute("trainride", trainRide);
        List<Station> station=stationService.getAllStation();
        model.addAttribute("station", station);
        List<Train> train=trainService.getAllTrains();
        model.addAttribute("train", train);
        return "user/trainrideCreate";
    }
    @GetMapping("/deleteTrainRide/{id}")
    public String deleteTrainRide(@PathVariable long id)
    {
        trainRidesService.deleteTrainRide(id);
        return "redirect:/managerTrainRide/trainride";
    }
    @PostMapping("/saveTrainRide")
    public String saveTrainRide(@ModelAttribute("trainride") TrainRide trainRide){
        trainRidesService.saveTrainRide(trainRide);
        return "redirect:/managerTrainRide/trainride";
    }

}
