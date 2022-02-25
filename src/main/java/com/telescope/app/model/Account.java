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
public class Account {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long companyId;

    @Column
    private String code;

    @Column
    private String name;
}
