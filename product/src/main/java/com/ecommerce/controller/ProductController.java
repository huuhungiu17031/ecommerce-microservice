package com.ecommerce.controller;

import com.ecommerce.dto.SuccessResponse;
import com.ecommerce.message.SuccessMessage;
import com.ecommerce.modal.Product;
import com.ecommerce.service.ProductService;
import com.ecommerce.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<SuccessResponse<List<Product>>> getProductsByInventoryId(@RequestParam("inventoryId") int inventoryId) {
        List<Product> products = productService.getProductsByInventoryId(inventoryId);
        return ResponseUtil.successResponse(products, SuccessMessage.FETCHED_PRODUCTS_BY_INVENTORY_ID);
    }

    @PostMapping
    public ResponseEntity<SuccessResponse<Product>> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseUtil.createdResponse(createdProduct, "Product created successfully");
    }

//    @PostMapping
//    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//        Product savedProduct = productRepository.save(product);
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Product> getProductById(@PathVariable String id) {
//        Optional<Product> product = productRepository.findById(id);
//        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/inventory/{inventoryId}")
//    public List<Product> getProductsByInventoryId(@PathVariable int inventoryId) {
//        return productRepository.findByInventoryId(inventoryId);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product) {
//        if (!productRepository.existsById(id)) return ResponseEntity.notFound().build();
//        product.setId(id);
//        Product updatedProduct = productRepository.save(product);
//        return ResponseEntity.ok(updatedProduct);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
//        if (!productRepository.existsById(id)) return ResponseEntity.notFound().build();
//        productRepository.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
}
