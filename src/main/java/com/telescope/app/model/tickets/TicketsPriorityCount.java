package com.telescope.app.model.tickets;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class TicketsPriorityCount {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long companyId;

    @Column
    private long accountId;

    @Column
    private long ticketPeriod;

    @Column
    private int priority;

    @Column
    private int count;
}
