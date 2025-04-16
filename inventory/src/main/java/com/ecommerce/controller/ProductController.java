package com.ecommerce.controller;

import com.ecommerce.dto.SuccessResponse;

import com.ecommerce.message.SuccessMessage;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import com.ecommerce.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public ResponseEntity<SuccessResponse<List<Product>>> getProductsByInventoryId(@RequestParam("inventoryId") int inventoryId) {
//        return ResponseUtil.successResponse(
//                productService.getProductsByInventoryId(inventoryId),
//                SuccessMessage.FETCHED_PRODUCTS_BY_INVENTORY_ID
//        );
//    }
//
//    @PostMapping
//    public ResponseEntity<SuccessResponse<Product>> createProduct(@RequestBody Product product) {
//        Product createdProduct = productService.createProduct(product);
//        return ResponseUtil.createdResponse(
//                createdProduct,
//                SuccessMessage.PRODUCT_CREATED
//        );
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<SuccessResponse<Product>> getProductById(@PathVariable String id) {
//        return ResponseUtil.createdResponse(
//                productService.getProductById(id),
//                SuccessMessage.OPERATION_SUCCESS
//        );
//    }
}
