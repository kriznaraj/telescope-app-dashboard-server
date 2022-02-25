package com.telescope.app;

import com.telescope.app.model.Account;
import com.telescope.app.model.Company;
import com.telescope.app.model.Period;
import com.telescope.app.model.tpv.Tpv;
import com.telescope.app.repository.AccountRepository;
import com.telescope.app.repository.CompanyRepository;
import com.telescope.app.repository.PeriodRepository;
import com.telescope.app.repository.ticket.TicketRepository;
import com.telescope.app.repository.tpv.TpvRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DbSeeder implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DbSeeder.class);

    TicketRepository ticketRepository;
    TpvRepository tpvRepository;
    AccountRepository accountRepository;
    PeriodRepository periodRepository;
    CompanyRepository companyRepository;


    private void generateCompanies() {
        List<Company> companyList = new ArrayList<>();
        companyList.add(Company.builder().name("Chargebee").build());
        companyRepository.saveAll(companyList);
    }

    private void generateAccounts() {
        List<Account> accountList = new ArrayList<>();
        accountList.add(Account.builder().code("abc").name("Abc Inc.").companyId(1).build());
        accountList.add(Account.builder().code("tsk").name("Tsk Corp.").companyId(1).build());
        accountList.add(Account.builder().code("dumil").name("Dumil.com").companyId(1).build());
        accountList.add(Account.builder().code("dubakoor").name("Dubakoor Inc.").companyId(1).build());

        accountRepository.saveAll(accountList);
    }


    private void generatePeriods() {
        List<Period> periodList = new ArrayList<>();
        periodList.add(Period.builder().id(202202).name("Feb 2022").month(2).year(2022).build());
        periodList.add(Period.builder().id(202201).name("Jan 2022").month(1).year(2022).build());
        periodList.add(Period.builder().id(202112).name("Dec 2021").month(12).year(2021).build());
        periodList.add(Period.builder().id(202111).name("Nov 2021").month(11).year(2021).build());
        periodList.add(Period.builder().id(202110).name("Oct 2021").month(10).year(2021).build());
        periodRepository.saveAll(periodList);
    }

    private void generateTpvs() {
        List<Tpv> tpvList = new ArrayList<>();
        tpvList.add(Tpv.builder().period(202202).accountId(1).value(BigDecimal.valueOf(100d)).build());
        tpvList.add(Tpv.builder().period(202201).accountId(1).value(BigDecimal.valueOf(123d)).build());
        tpvList.add(Tpv.builder().period(202112).accountId(1).value(BigDecimal.valueOf(149d)).build());
        tpvList.add(Tpv.builder().period(202110).accountId(1).value(BigDecimal.valueOf(99d)).build());

        tpvList.add(Tpv.builder().period(202202).accountId(2).value(BigDecimal.valueOf(1000d)).build());
        tpvList.add(Tpv.builder().period(202201).accountId(2).value(BigDecimal.valueOf(800d)).build());
        tpvList.add(Tpv.builder().period(202112).accountId(2).value(BigDecimal.valueOf(500d)).build());
        tpvList.add(Tpv.builder().period(202110).accountId(2).value(BigDecimal.valueOf(200d)).build());

        tpvRepository.saveAll(tpvList);
    }

    @Override
    public void run(String... args) throws Exception {
        generateCompanies();
        generateAccounts();
        generatePeriods();
        generateTpvs();
    }

    public void queryAllData() {
        logger.info("Company size: {}", this.companyRepository.findAll().size());
        logger.info("Period size: {}", this.periodRepository.findAll().size());
        logger.info("Tickets size: {}", this.ticketRepository.findAll().size());
        logger.info("Accounts size: {}", this.accountRepository.findAll().size());
        logger.info("TPVs size: {}", this.tpvRepository.findAll().size());
    }
}
