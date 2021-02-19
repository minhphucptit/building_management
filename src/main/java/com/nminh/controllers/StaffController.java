package com.nminh.controllers;

import com.nminh.models.Staff;
import com.nminh.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/manage")
public class StaffController {
    @Autowired
    StaffService staffService;
    @GetMapping("/staff")
    public ResponseEntity<Iterable<Staff>> getAllCompany(){
        return new ResponseEntity<>(staffService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/staff/save")
    ResponseEntity<Iterable<Staff>> save(@RequestBody Staff staff){
        staffService.save(staff);
        return new ResponseEntity<>(staffService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/staff/delete/{id}")
    ResponseEntity<Iterable<Staff>> delete(@PathVariable(name="id") Integer id){
        staffService.delete(id);
        return new ResponseEntity<>(staffService.findAll(), HttpStatus.OK);
    }
    @GetMapping("staff/edit/{id}")
    ResponseEntity<Staff> edit(@PathVariable(name="id") Integer id){
        Optional<Staff> optional= staffService.findById(id);
        Staff model= optional.get();
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
