package com.rungoop.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Train;
import com.rungoop.web.entity.TrainRide;
@Service
public interface TrainRidesService  {
    List<TrainRide> getAllTrainRides();

    TrainRide getTrainRideById(long id);

    TrainRide updateTrainRide(TrainRide trainRide);

    TrainRide saveTrainRide(TrainRide trainRide);

    void deleteTrainRide(long id);

}
