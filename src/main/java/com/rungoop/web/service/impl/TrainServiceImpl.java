package com.rungoop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Train;
import com.rungoop.web.reponsitory.TrainsRepository;
import com.rungoop.web.service.TrainService;
@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainsRepository trainsRepository;

    @Override
    public List<Train> getAllTrains() {
        // TODO Auto-generated method stub
        return trainsRepository.findAll();
    }

    @Override
    public Train editTrain(Train train) {
        // TODO Auto-generated method stub
        return trainsRepository.save(train);
    }

    @Override
    public Train createTrain(Train train) {
        // TODO Auto-generated method stub
       return trainsRepository.save(train);
    }

    @Override
    public void deleteTrain(long id) {
        // TODO Auto-generated method stub
        trainsRepository.deleteById(id);
    }

    @Override
    public Train getTrainById(long id) {
        // TODO Auto-generated method stub
        return trainsRepository.findById(id).get();
    }

    
}
