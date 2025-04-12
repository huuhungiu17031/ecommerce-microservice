package com.ecommerce.message;

public class ErrorMessage {

    private ErrorMessage() {}

    // Product
    public static final String PRODUCT_NOT_FOUND = "Product not found";
    public static final String PRODUCT_CREATION_FAILED = "Failed to create product";
    public static final String PRODUCT_UPDATE_FAILED = "Failed to update product";

    // Rating
    public static final String RATING_NOT_FOUND = "Rating not found";
    public static final String RATING_CREATION_FAILED = "Failed to create rating";

    // Cart
    public static final String CART_ITEM_NOT_FOUND = "Cart item not found";
    public static final String CART_EMPTY = "Cart is empty";
    public static final String CART_UPDATE_FAILED = "Failed to update cart item";

    // Payment
    public static final String PAYMENT_FAILED = "Payment processing failed";
    public static final String PAYMENT_NOT_FOUND = "Payment not found";

    // Inventory
    public static final String INVENTORY_NOT_FOUND = "Inventory record not found";
    public static final String INVENTORY_UPDATE_FAILED = "Failed to update inventory";

    // Validation
    public static final String INVALID_REQUEST = "Invalid request";
    public static final String MISSING_REQUIRED_FIELDS = "Missing required fields";

    // Auth
    public static final String UNAUTHORIZED = "Unauthorized access";
    public static final String FORBIDDEN = "Access denied";

    // General
    public static final String INTERNAL_SERVER_ERROR = "Internal server error";
    public static final String RESOURCE_NOT_FOUND = "Requested resource not found";
    public static final String OPERATION_FAILED = "Operation failed to complete";
}
