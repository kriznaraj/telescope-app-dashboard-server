package com.telescope.app.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Period {
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private int month;

    @Column
    private int year;
}
