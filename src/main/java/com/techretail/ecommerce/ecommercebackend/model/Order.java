package com.techretail.ecommerce.ecommercebackend.model;

import com.techretail.ecommerce.ecommercebackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class Order {

    @Autowired
    private OrderService orderService;

    @GetMapping
    List<Order> getAllOrders() {
        return  orderService.getAllOrders();
    }
}
