package com.rungoop.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rungoop.web.entity.Station;

@Service
public interface StationService {
    List<Station> getAllStation();

    Station getStationById(long id);

    Station createStation(Station station);

    void deleteStation(long id);
}
