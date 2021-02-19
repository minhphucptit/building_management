package com.nminh.services;

import com.nminh.models.Officer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OfficerService {
    @Autowired
    private OfficerRepository companyDao;

    public Optional findById(Integer id){
        return companyDao.findById(id);
    }

    public void delete(Integer id){
        companyDao.deleteById(id);
    }

    public void save(Officer company){
        companyDao.save(company);
    }

    public Iterable findAll(){
        return companyDao.findAll();
    }

    public List<Officer> findByName(String name){
        return companyDao.findByName(name);
    }
}
