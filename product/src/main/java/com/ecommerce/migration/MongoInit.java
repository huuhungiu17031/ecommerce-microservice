package com.ecommerce.migration;

import com.ecommerce.modal.Brand;
import com.ecommerce.modal.Category;

import io.mongock.api.annotations.BeforeExecution;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.ecommerce.modal.Product;

@ChangeUnit(id = "client-initializer", order = "001", author = "mongock")
public class MongoInit {
    private final MongoTemplate mongoTemplate;

    public MongoInit(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @BeforeExecution
    public void beforeExecution() {
        mongoTemplate.dropCollection(Product.class);
        mongoTemplate.dropCollection(Category.class);
        mongoTemplate.dropCollection(Brand.class);
    }

    @Execution
    public void execution() {
        mongoTemplate.createCollection(Product.class);
    }

    @RollbackExecution
    public void rollback() {
        mongoTemplate.dropCollection(Product.class);
        mongoTemplate.dropCollection(Category.class);
        mongoTemplate.dropCollection(Brand.class);
    }
}