package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.payload.OrderPayload;

public interface OrderService {
    void placeOrder(OrderPayload orderPayload);
}
