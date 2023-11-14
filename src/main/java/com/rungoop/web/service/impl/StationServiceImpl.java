package com.rungoop.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Station;
import com.rungoop.web.reponsitory.StationRepository;
import com.rungoop.web.service.StationService;
@Service
public class StationServiceImpl implements StationService{
    @Autowired
    private StationRepository stationRepository;

    @Override
    public List<Station> getAllStation() {
        // TODO Auto-generated method stub
        return stationRepository.findAll();
    }

    @Override
    public Station getStationById(long id) {
        // TODO Auto-generated method stub
        return stationRepository.findById(id).get();
    }

    @Override
    public Station createStation(Station station) {
        // TODO Auto-generated method stub
        return stationRepository.save(station);
    }

    @Override
    public void deleteStation(long id) {
        // TODO Auto-generated method stub
        stationRepository.deleteById(id);
    }

    
}
