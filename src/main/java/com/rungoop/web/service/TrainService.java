package com.rungoop.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Train;
@Service
public interface TrainService{
    List<Train> getAllTrains();

    Train getTrainById(long id);

    Train editTrain(Train train);

    Train createTrain(Train train);

    void deleteTrain(long id);
}
