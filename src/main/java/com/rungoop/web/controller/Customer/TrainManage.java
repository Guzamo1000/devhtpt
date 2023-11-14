package com.rungoop.web.controller.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rungoop.web.entity.Train;
import com.rungoop.web.service.TrainService;

@Controller
@RequestMapping("/managerTrain")
public class TrainManage {
    @Autowired
    private TrainService trainService;

    @GetMapping("/train")
    public String getAllTrain(Model model){
        List<Train> listTrain=trainService.getAllTrains();
        System.out.println("train: "+ listTrain);
        model.addAttribute("trains", trainService.getAllTrains());
        return "/user/trainManage";
    }
    @GetMapping("/newTrain")
    public String newTrain(Model model)
    {
        Train train=new Train();
        model.addAttribute("train", train);
        System.out.println("train: "+train);
        return "/user/trainCreate";
    }
    @GetMapping("/editTrain/{id}")
    public String editTrain(@PathVariable Long id, Model model){
        model.addAttribute("train", trainService.getTrainById(id));
        return "user/trainEdit";
    }
    @PostMapping("/editTrain/{id}")
    public String editTrain(@PathVariable long id, @ModelAttribute("train") Train train, Model model)
    {
        Train trainupdate=trainService.getTrainById(id);
        trainupdate.setId(id);
        trainupdate.setManufacturing(train.getManufacturing());
        trainupdate.setClass1Seats(train.getClass1Seats());
        trainupdate.setClass2Seats(train.getClass2Seats());
        trainService.editTrain(trainupdate);
        return "redirect:/managerTrain/train";
    }
    @GetMapping("/deleteTrain/{id}")
    public String deleteTrain(@PathVariable long id){
        trainService.deleteTrain(id);
        return "redirect:/managerTrain/train";
    }
}
