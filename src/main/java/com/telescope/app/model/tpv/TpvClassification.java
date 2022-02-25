package com.telescope.app.model.tpv;

import com.telescope.app.model.CategoryColor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class TpvClassification {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private long companyId;

    @Column
    private long accountId;

    @Column
    private CategoryColor type;
}
