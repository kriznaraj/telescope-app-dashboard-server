package com.telescope.app.repository.tpv;

import com.telescope.app.model.tpv.TpvClassification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TpvClassificationRepository extends JpaRepository<TpvClassification, Long> {
}