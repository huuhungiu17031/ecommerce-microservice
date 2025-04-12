package com.ecommerce.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "brands")
public class Brand {
    @Id
    private String id;
    private String brand_name;
    private String brand_logo;
    private String product_id;
}
