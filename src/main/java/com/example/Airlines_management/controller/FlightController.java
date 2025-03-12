package com.example.airlinesmanagement.controller;

import com.example.airlinesmanagement.entity.Flight;
import com.example.airlinesmanagement.service.FlightService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/schedule")
    public List<Flight> getFlightSchedule(@RequestParam String source, @RequestParam String destination) {
        return flightService.getFlightSchedule(source, destination);
    }
}
