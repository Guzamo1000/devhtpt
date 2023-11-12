package com.rungoop.web.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rungoop.web.entity.Station;
@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    
}
