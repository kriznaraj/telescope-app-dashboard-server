package com.telescope.app.repository.ticket;

import com.telescope.app.model.tickets.TicketsModuleCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketModuleCountRepository extends JpaRepository<TicketsModuleCount, Long> {
}
