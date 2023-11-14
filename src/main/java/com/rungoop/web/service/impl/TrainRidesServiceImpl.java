package com.rungoop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Train;
import com.rungoop.web.entity.TrainRide;
import com.rungoop.web.reponsitory.TrainRidesRepository;
import com.rungoop.web.service.TrainRidesService;
@Service
public class TrainRidesServiceImpl implements TrainRidesService {
    @Autowired
    private TrainRidesRepository trainRidesRepository;

    @Override
    public List<TrainRide> getAllTrainRides() {
        // TODO Auto-generated method stub
        return trainRidesRepository.findAll();
    }

    @Override
    public TrainRide getTrainRideById(long id) {
        // TODO Auto-generated method stub
        return trainRidesRepository.findById(id).get();
    }

    @Override
    public TrainRide updateTrainRide(TrainRide trainRide) {
        // TODO Auto-generated method stub
        return trainRidesRepository.save(trainRide);
    }

    @Override
    public TrainRide saveTrainRide(TrainRide trainRide) {
        // TODO Auto-generated method stub
       return trainRidesRepository.save(trainRide);
    }

    @Override
    public void deleteTrainRide(long id) {
        // TODO Auto-generated method stub
        trainRidesRepository.deleteById(id);
    }

    
}
