package com.viraj.sample.service;

import com.viraj.sample.entity.Company;
import com.viraj.sample.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CompanyServiceImpl implements CompanyService

{
    @Autowired
    CompanyRepository companyRepository;
    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompany() {
        return (List<Company>) companyRepository.findAll();
    }

    @Override
    public Optional<Company> getCompany(Long companyId) {
        return companyRepository.findById(companyId);
    }

    @Override
    public Company deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);

        return null;
    }
}
