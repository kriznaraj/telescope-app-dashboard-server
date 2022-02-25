package com.telescope.app.repository.ticket;

import com.telescope.app.model.tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
