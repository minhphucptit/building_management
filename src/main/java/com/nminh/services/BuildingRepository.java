package com.nminh.services;

import com.nminh.models.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BuildingRepository extends CrudRepository<Service,Integer> {
    public List<Service> findByName(final String name);
}
