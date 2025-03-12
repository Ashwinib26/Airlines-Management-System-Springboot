package com.example.airlinesmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.airlinesmanagement.entity.Ticket;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUserId(Long userId);
}
