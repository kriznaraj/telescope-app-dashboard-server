package com.telescope.app.service;

import com.telescope.app.model.Company;
import com.telescope.app.model.Period;
import com.telescope.app.repository.CompanyRepository;
import com.telescope.app.repository.PeriodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    private final PeriodRepository periodRepository;
    private final CompanyRepository companyRepository;

    public DashboardService(PeriodRepository periodRepository, CompanyRepository companyRepository) {
        this.periodRepository = periodRepository;
        this.companyRepository = companyRepository;
    }

    public List<Period> getPeriods() {
        return periodRepository.findAll();
    }

    public Company getCompany(long companyId) {
        return companyRepository.findById(companyId).orElseThrow();
    }

    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }
}
