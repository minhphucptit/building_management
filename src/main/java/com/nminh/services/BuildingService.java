package com.nminh.services;

import com.nminh.models.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service
public class BuildingService {
    @Autowired
    private BuildingRepository serviceDao;

    public Optional<Service> findById(Integer id){
        return serviceDao.findById(id);
    }

    public void delete(Integer id){
        serviceDao.deleteById(id);
    }

    public void save(Service service){
        serviceDao.save(service);
    }

    public Iterable findAll(){
        return serviceDao.findAll();
    }

    public List<Service> findByName(String name){
        return serviceDao.findByName(name);
    }
}
