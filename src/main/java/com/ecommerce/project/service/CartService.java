package com.ecommerce.project.service;

import com.ecommerce.project.payload.CartDTO;
import org.springframework.http.ResponseEntity;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
