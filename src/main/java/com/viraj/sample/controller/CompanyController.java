package com.viraj.sample.controller;

import com.viraj.sample.entity.Company;
import com.viraj.sample.exception.DuplicateRecordException;
import com.viraj.sample.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    @PostMapping("/")
    public Company saveCompany(@RequestBody Company company) {

        return companyService.saveCompany(company);
    }

    @PutMapping("/")
    public Company updateCompany(@RequestBody Company company) {

        return companyService.updateCompany(company);
    }

    @GetMapping("/getall")
    public List<Company> getAllCompany() {

        return companyService.getAllCompany();
    }

    @GetMapping("/{companyId}")
    public Company getCompany(@PathVariable(name = "companyId") Long companyId) {
        return companyService.deleteCompany(companyId);
    }

}
