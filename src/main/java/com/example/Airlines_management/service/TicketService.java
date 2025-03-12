package com.example.airlinesmanagement.service;

import com.example.airlinesmanagement.entity.Ticket;
import com.example.airlinesmanagement.entity.Flight;
import com.example.airlinesmanagement.entity.User;
import com.example.airlinesmanagement.repository.TicketRepository;
import com.example.airlinesmanagement.repository.FlightRepository;
import com.example.airlinesmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final FlightRepository flightRepository;
    private final UserRepository userRepository;

    public TicketService(TicketRepository ticketRepository, FlightRepository flightRepository, UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.flightRepository = flightRepository;
        this.userRepository = userRepository;
    }

    public Ticket bookTicket(Long flightId, Long userId) {
        Flight flight = flightRepository.findById(flightId).orElseThrow();
        User user = userRepository.findById(userId).orElseThrow();
        Ticket ticket = new Ticket(null, flight, user, "Booked");
        return ticketRepository.save(ticket);
    }

    public void cancelTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        ticket.setStatus("Cancelled");
        ticketRepository.save(ticket);
    }
}
