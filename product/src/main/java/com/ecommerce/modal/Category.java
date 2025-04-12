package com.ecommerce.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    private int shop_id;
    private String product_name;
    private String product_description;
    @DBRef
    private Set<Product> products = new HashSet<>();
}
