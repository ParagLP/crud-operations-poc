package com.viraj.sample.service;

import com.viraj.sample.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService
{

    Company saveCompany(Company company) ;
    Company updateCompany(Company company);
    List<Company> getAllCompany();
    Optional<Company> getCompany(Long companyId);
    Company deleteCompany(Long companyId);
}
