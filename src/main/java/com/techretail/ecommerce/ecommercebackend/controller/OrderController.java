package com.techretail.ecommerce.ecommercebackend.controller;


import com.techretail.ecommerce.ecommercebackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    List<com.techretail.ecommerce.ecommercebackend.model.Order> getAllOrders() {
        return  orderService.getAllOrders();
    }

}
