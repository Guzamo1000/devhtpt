package com.rungoop.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Train;
import com.rungoop.web.entity.TrainRide;
@Repository
public interface TrainRidesRepository extends JpaRepository<TrainRide, Long>{
    
}
