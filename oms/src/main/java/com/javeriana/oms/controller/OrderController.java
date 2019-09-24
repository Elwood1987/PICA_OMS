package com.javeriana.oms.controller;

import com.javeriana.oms.dto.OrderDTO;
import com.javeriana.oms.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/create")
    public ResponseEntity<Object> createOrder(@RequestBody OrderDTO orderDTO) {
        return this.orderService.createOrder(orderDTO);
    }
}
