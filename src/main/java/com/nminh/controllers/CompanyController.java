package com.nminh.controllers;

import com.nminh.models.Company;
import com.nminh.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/manage")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @GetMapping("/company")
    public ResponseEntity<Iterable<Company>> getAllCompany(){

        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/company/save")
    ResponseEntity<Iterable<Company>> save(@RequestBody Company company){
        companyService.save(company);
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/company/delete/{id}")
    ResponseEntity<Iterable<Company>> delete(@PathVariable(name="id") Integer id){
        companyService.delete(id);
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }
    @PostMapping("company/edit/{id}")
    ResponseEntity<Iterable<Company>> edit(@RequestBody Company company,@PathVariable(name="id") Integer id){
        Optional<Company> optional=companyService.findById(id);
        Company model= optional.get();
        model.setName(company.getName());
        model.setAddress(company.getAddress());
        companyService.save(model);
        return new ResponseEntity<>(companyService.findAll(), HttpStatus.OK);
    }
}
