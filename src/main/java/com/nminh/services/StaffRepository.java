package com.nminh.services;

import com.nminh.models.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StaffRepository extends CrudRepository<Staff,Integer> {
    public List<Staff> findByName(final String name);
}
