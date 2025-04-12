package com.ecommerce.service;

import com.ecommerce.modal.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(String id);
    List<Product> getProductsByShopId(int shopId);
    List<Product> getProductsByInventoryId(int inventoryId);
    Product createProduct(Product product);
}
