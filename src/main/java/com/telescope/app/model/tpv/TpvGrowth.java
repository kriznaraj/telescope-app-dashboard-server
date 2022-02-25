package com.telescope.app.model.tpv;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
public class TpvGrowth {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long companyId;

    @Column
    private long accountId;

    @Column
    private BigDecimal growth5;

    @Column
    private BigDecimal growth4;

    @Column
    private BigDecimal growth3;

    @Column
    private BigDecimal growth2;

    @Column
    private BigDecimal growth1;
}
