package com.ecommerce.payload;

import com.ecommerce.model.Order;
import com.ecommerce.model.OrderItem;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class OrderPayload extends Order {
    List<OrderItem> orderItems;
}
