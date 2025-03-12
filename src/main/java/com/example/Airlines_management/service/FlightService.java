package com.example.airlinesmanagement.service;

import com.example.airlinesmanagement.entity.Flight;
import com.example.airlinesmanagement.repository.FlightRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getFlightSchedule(String source, String destination) {
        return flightRepository.findBySourceAndDestination(source, destination);
    }
}
