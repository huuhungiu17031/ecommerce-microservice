package com.ecommerce.utils;

import com.ecommerce.config.RabbitConfig;
import com.ecommerce.payload.OrderPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMq {
    private final AmqpTemplate amqpTemplate;

    public RabbitMq(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendOrderToInventory(OrderPayload orderPayload) {
        try {
            // Send the message to the inventory service
            amqpTemplate.convertAndSend(RabbitConfig.INVENTORY_EXCHANGE_NAME, RabbitConfig.INVENTORY_ROUTING_KEY, orderPayload);
            log.info("Successfully sent order to inventory: {}", orderPayload);
        } catch (Exception e) {
            log.error("Failed to send order to inventory: {}", orderPayload, e);
        }
    }
}
