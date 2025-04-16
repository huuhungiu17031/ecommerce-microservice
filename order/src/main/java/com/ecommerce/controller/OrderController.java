package com.ecommerce.controller;


import com.ecommerce.payload.OrderPayload;
import com.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderPayload placeOrder(@RequestBody OrderPayload orderPayload) {
        return orderPayload;
    }
}
