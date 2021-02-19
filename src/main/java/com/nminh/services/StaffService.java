package com.nminh.services;

import com.nminh.models.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StaffService {
    @Autowired
    private StaffRepository staffDao;

    public Optional findById(Integer id){
        return staffDao.findById(id);
    }

    public void delete(Integer id){
        staffDao.deleteById(id);
    }

    public void save(Staff company){
        staffDao.save(company);
    }

    public Iterable findAll(){
        return staffDao.findAll();
    }

    public List<Staff> findByName(String name){
        return staffDao.findByName(name);
    }
}
