package com.telescope.app.controller;

import com.telescope.app.model.tickets.Ticket;
import com.telescope.app.model.tickets.TicketsModuleCount;
import com.telescope.app.model.tickets.TicketsPriorityCount;
import com.telescope.app.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Ticket>> getTickets() {
        return ResponseEntity.ok(ticketService.getTickets());
    }


    @GetMapping(value = "/modules")
    public ResponseEntity<List<TicketsModuleCount>> getTicketsCountByModules() {
        return ResponseEntity.ok(ticketService.getTicketsCountByModules());
    }

    @GetMapping(value = "/priority")
    public ResponseEntity<List<TicketsPriorityCount>> getTicketsCountByPriority() {
        return ResponseEntity.ok(ticketService.getTicketsCountByPriority());
    }
}
