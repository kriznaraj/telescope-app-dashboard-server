package com.telescope.app.repository;

import com.telescope.app.model.Period;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodRepository extends JpaRepository<Period, Long> {
}
