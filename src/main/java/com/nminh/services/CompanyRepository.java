package com.nminh.services;

import com.nminh.models.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
@org.springframework.stereotype.Repository
public interface CompanyRepository extends CrudRepository<Company,Integer> {
    public List<Company> findByName(final String name);
}
