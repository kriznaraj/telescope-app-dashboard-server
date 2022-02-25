package com.telescope.app.repository.ticket;

import com.telescope.app.model.tickets.TicketsPriorityCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketPriorityCountRepository extends JpaRepository<TicketsPriorityCount, Long> {
}
