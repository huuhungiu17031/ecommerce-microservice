package com.ecommerce.service.impl;

import com.ecommerce.exception.serviceException.ItemNotFoundException;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  {
//    private final ProductRepository productRepository;
//    public ProductServiceImpl(
//            ProductRepository productRepository
//    ) {
//        this.productRepository = productRepository;
//    }
//
//
//    @Override
//    public Product getProductById(String id) {
//        return productRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
//    }
//
//    @Override
//    public List<Product> getProductsByShopId(int shopId) {
//        return productRepository.findByShopId(shopId);
//    }
//
//    @Override
//    public List<Product> getProductsByInventoryId(int inventoryId) {
//        return List.of();
//    }
//
//    @Override
//    public Product createProduct(Product product) {
//        return productRepository.save(product);
//    }

}
