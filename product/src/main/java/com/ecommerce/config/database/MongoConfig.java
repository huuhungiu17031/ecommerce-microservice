package com.ecommerce.config.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.host}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port}")
    private int mongoPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDatabase;

    @Value("${spring.data.mongodb.username}")
    private String mongoUsername;

    @Value("${spring.data.mongodb.password}")
    private String mongoPassword;

    @Bean
    public MongoClient mongoClient() {
        String connectionString = String.format(
                "mongodb://%s:%s@%s:%d/%s",
                mongoUsername, mongoPassword, mongoHost, mongoPort, mongoDatabase);

        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), mongoDatabase);
    }
}