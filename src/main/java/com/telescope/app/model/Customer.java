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
public class Customer {


    @Id
    @GeneratedValue
    private long id;


    @Column
    private String firstName;

    @Column
    private String lastName;


    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
