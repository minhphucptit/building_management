package com.nminh.services;

import com.nminh.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyDao;

    public Optional<Company> findById(Integer id){
        return companyDao.findById(id);
    }

    public void delete(Integer id){
        companyDao.deleteById(id);
    }

    public void save(Company company){
        companyDao.save(company);
    }

    public Iterable findAll(){
        return companyDao.findAll();
    }

    public List<Company> findByName(String name){
        return companyDao.findByName(name);
    }

}
