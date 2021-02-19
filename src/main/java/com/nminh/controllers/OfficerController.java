package com.nminh.controllers;

import com.nminh.models.Company;
import com.nminh.models.Officer;
import com.nminh.services.OfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/manage")
public class OfficerController {
    @Autowired
    OfficerService officerService;
    @GetMapping("/officer")
    public ResponseEntity<Iterable<Company>> getAllCompany(){
        return new ResponseEntity<>(officerService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/officer/save")
    ResponseEntity<Iterable<Officer>> save(@RequestBody Officer officer){
        officerService.save(officer);
        return new ResponseEntity<>(officerService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/officer/delete/{id}")
    ResponseEntity<Iterable<Officer>> delete(@PathVariable(name="id") Integer id){
        officerService.delete(id);
        return new ResponseEntity<>(officerService.findAll(), HttpStatus.OK);
    }
    @GetMapping("officer/edit/{id}")
    ResponseEntity<Officer> edit(@PathVariable(name="id") Integer id){
        Optional<Officer> optional= officerService.findById(id);
        Officer model= optional.get();
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
