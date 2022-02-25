package com.telescope.app.model.tickets;

import com.telescope.app.model.CategoryColor;
import com.telescope.app.model.Period;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {

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
    private String description;

    @Column
    private String module;

    @Column
    private boolean slaBreach;

    @Column
    private CategoryColor sentiment;

    @Column
    private String internalStatus;

    @Column
    private Timestamp createdOn;

    @Column
    private int age;

    @Column
    private String externalStatus;

    @Column
    private String poc;

    @Column
    private String tags;

}
