package com.nminh.services;

import com.nminh.models.Company;
import com.nminh.models.Order;
import com.nminh.models.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
@org.springframework.stereotype.Service
public class OrderService {
    @Autowired
    private OrderRepository orderDao;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private BuildingService buildingService;

    public Optional findById(Integer id){
        return orderDao.findById(id);
    }

    public void delete(Integer id){
        orderDao.deleteById(id);
    }

    public void save(Integer companyId,Integer serviceId){
        Company company=companyService.findById(companyId).get();
        Service service=buildingService.findById(serviceId).get();
        Date date= Calendar.getInstance().getTime();
        Order order=new Order(company,service,date);
        orderDao.save(order);
    }

    public Iterable findAll(){
        return orderDao.findAll();
    }

}
