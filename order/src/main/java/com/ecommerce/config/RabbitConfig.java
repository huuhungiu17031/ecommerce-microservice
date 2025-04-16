package com.ecommerce.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String INVENTORY_EXCHANGE_NAME = "inventory.exchange";
    public static final String INVENTORY_QUEUE_NAME = "inventory.update.queue";
    public static final String INVENTORY_ROUTING_KEY = "inventory.update";

    @Bean
    public TopicExchange inventoryExchange() {
        return new TopicExchange(INVENTORY_EXCHANGE_NAME);
    }

    @Bean
    public Queue inventoryQueue() {
        return new Queue(INVENTORY_QUEUE_NAME);
    }

    @Bean
    public Binding inventoryBinding(Queue inventoryQueue, TopicExchange inventoryExchange) {
        return BindingBuilder.bind(inventoryQueue).to(inventoryExchange).with(INVENTORY_ROUTING_KEY);
    }
}
