package com.telescope.app.model.tpv;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tpv {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long companyId;

    @Column
    private long accountId;

    @Column
    private long period;

    @Column
    private BigDecimal value;
}
