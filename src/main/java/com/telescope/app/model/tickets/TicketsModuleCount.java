package com.telescope.app.model.tickets;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class TicketsModuleCount {

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
    private String module;

    @Column
    private int count;
}
