package com.telescope.app.service;

import com.telescope.app.model.tickets.Ticket;
import com.telescope.app.model.tickets.TicketsModuleCount;
import com.telescope.app.model.tickets.TicketsPriorityCount;
import com.telescope.app.repository.ticket.TicketModuleCountRepository;
import com.telescope.app.repository.ticket.TicketPriorityCountRepository;
import com.telescope.app.repository.ticket.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final TicketModuleCountRepository ticketModuleCountRepository;
    private final TicketPriorityCountRepository ticketPriorityCountRepository;

    public TicketService(TicketRepository ticketRepository, TicketModuleCountRepository ticketModuleCountRepository, TicketPriorityCountRepository ticketPriorityCountRepository) {

        this.ticketRepository = ticketRepository;
        this.ticketModuleCountRepository = ticketModuleCountRepository;
        this.ticketPriorityCountRepository = ticketPriorityCountRepository;
    }

    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }

    public List<TicketsModuleCount> getTicketsCountByModules() {
        return ticketModuleCountRepository.findAll();
    }

    public List<TicketsPriorityCount> getTicketsCountByPriority() {
        return ticketPriorityCountRepository.findAll();
    }
}
