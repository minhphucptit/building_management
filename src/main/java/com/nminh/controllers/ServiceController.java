package com.nminh.controllers;

import com.nminh.models.Officer;
import com.nminh.models.Service;
import com.nminh.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/manage")
public class ServiceController {
    @Autowired
    BuildingService buildingService;
    @GetMapping("/service")
    public ResponseEntity<Iterable<Service>> getAllCompany(){
        return new ResponseEntity<>(buildingService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/service/save")
    ResponseEntity<Iterable<Officer>> save(@RequestBody Service service){
        buildingService.save(service);
        return new ResponseEntity<>(buildingService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/service/delete/{id}")
    ResponseEntity<Iterable<Officer>> delete(@PathVariable(name="id") Integer id){
        buildingService.delete(id);
        return new ResponseEntity<>(buildingService.findAll(), HttpStatus.OK);
    }
    @GetMapping("service/edit/{id}")
    ResponseEntity<Service> edit(@PathVariable(name="id") Integer id){
        Optional<Service> optional= buildingService.findById(id);
        Service model= optional.get();
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
