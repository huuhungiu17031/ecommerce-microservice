package com.ecommerce.exception.serviceException;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String id) {
        super("Item not found with ID: " + id);
    }

    public ItemNotFoundException(int id) {
        super("Item not found with ID: " + id);
    }
}
