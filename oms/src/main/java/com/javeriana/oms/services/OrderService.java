package com.javeriana.oms.services;

import com.javeriana.oms.dto.OrderDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public ResponseEntity<Object> createOrder(OrderDTO orderDTO) {
        try {
            return new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
