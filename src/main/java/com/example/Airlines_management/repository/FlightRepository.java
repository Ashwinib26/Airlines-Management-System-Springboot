package com.example.airlinesmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.airlinesmanagement.entity.Flight;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestination(String source, String destination);
}
