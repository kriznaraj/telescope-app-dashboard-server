package com.telescope.app.controller;


import com.telescope.app.model.Company;
import com.telescope.app.model.Period;
import com.telescope.app.service.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping(value = "/periods")
    public ResponseEntity<List<Period>> getPeriods() {
        return ResponseEntity.ok(dashboardService.getPeriods());
    }

    @GetMapping(value = "/company/{companyId}")
    public ResponseEntity<Company> getCompanyById(@PathVariable long companyId) {
        return ResponseEntity.ok(dashboardService.getCompany(companyId));
    }

    @GetMapping(value = "/companies")
    public ResponseEntity<List<Company>> getCompanies() {
        return ResponseEntity.ok(dashboardService.getCompanies());
    }
}
