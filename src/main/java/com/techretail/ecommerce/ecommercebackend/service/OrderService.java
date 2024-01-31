package com.techretail.ecommerce.ecommercebackend.service;

import com.techretail.ecommerce.ecommercebackend.model.Order;
import com.techretail.ecommerce.ecommercebackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;


    @Autowired
    OrderService(OrderRepository orderRepository) {this.orderRepository = orderRepository;}



    // return all orders
     public List<Order> getAllOrders() {
    return orderRepository.findAll();
    }

    // return order by id
    public Optional<Order> getOrderById(UUID id) {
        return orderRepository.findById(id);
    }

    // add 1 order
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }
}
