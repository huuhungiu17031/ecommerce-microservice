package com.ecommerce.service.impl;

import com.ecommerce.payload.OrderPayload;
import com.ecommerce.service.OrderService;
import com.ecommerce.utils.RabbitMq;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final RabbitMq rabbitMq;
    public OrderServiceImpl(
            RabbitMq rabbitMq
    ) {
        this.rabbitMq = rabbitMq;
    }

    @Override
    public void placeOrder(OrderPayload orderPayload) {

    }
}
