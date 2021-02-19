package com.nminh.services;

import com.nminh.models.Officer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OfficerRepository extends CrudRepository<Officer,Integer> {
    public List<Officer> findByName(final  String name);
}
