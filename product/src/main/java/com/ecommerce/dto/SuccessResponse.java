package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class SuccessResponse<T> {
    private LocalDateTime timestamp;
    private String message;
    private T data;
}
