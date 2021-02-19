package com.nminh.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nminh.models.Order;
import com.nminh.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order")
    public ResponseEntity<Iterable<Order>> getAll(){
        return new ResponseEntity<Iterable<Order>>(orderService.findAll(), HttpStatus.OK);
    }
    @PostMapping ("/order/save")
    public ResponseEntity<Iterable<Order>> save(@RequestBody ObjectNode jsonNodes){
        Integer companyId=jsonNodes.get("companyId").asInt();
        Integer serviceId=jsonNodes.get("serviceId").asInt();
        orderService.save(companyId,serviceId);
        return new ResponseEntity<Iterable<Order>>(orderService.findAll(), HttpStatus.OK);
    }
    @GetMapping("order/delete/{id}")
    public ResponseEntity<Iterable<Order>> delete(@PathVariable(name="id") Integer id){
        orderService.delete(id);
        return new ResponseEntity<Iterable<Order>>(orderService.findAll(), HttpStatus.OK);
    }
}
