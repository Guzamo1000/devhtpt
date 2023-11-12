package com.rungoop.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Train;
@Repository
public interface TrainsRepository extends JpaRepository<Train, Long> {
    
}
