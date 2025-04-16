package com.ecommerce.message;

public class SuccessMessage {

    private SuccessMessage() {}

    // Product
    public static final String PRODUCT_CREATED = "Product created successfully";
    public static final String PRODUCT_UPDATED = "Product updated successfully";
    public static final String PRODUCT_DELETED = "Product deleted successfully";
    public static final String FETCHED_PRODUCTS_BY_INVENTORY_ID = "Fetched products by inventory ID";

    // Rating
    public static final String RATING_CREATED = "Rating was created";
    public static final String RATING_DELETED = "Rating was deleted";

    // Cart
    public static final String CART_ITEM_ADDED = "Product added to cart successfully";
    public static final String CART_ITEM_UPDATED = "Cart item updated successfully";
    public static final String CART_ITEM_DELETED = "Cart item deleted successfully";
    public static final String CART_CLEARED = "All items deleted from cart successfully";

    // Payment
    public static final String PAYMENT_COMPLETED = "Payment has been successfully processed";
    public static final String PAYMENT_PENDING = "Payment is pending approval";
    public static final String PAYMENT_CANCELLED = "Payment has been cancelled. Please create a new order";

    // Inventory
    public static final String INVENTORY_UPDATED = "Inventory updated successfully";

    // General
    public static final String OPERATION_SUCCESS = "Operation completed successfully";
}
