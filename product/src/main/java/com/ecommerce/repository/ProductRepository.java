package com.ecommerce.repository;

import com.ecommerce.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByInventoryId(int inventoryId);

    List<Product> findByShopId(int shopId);
}
