package com.ecommerce.project.service;

import com.ecommerce.project.payload.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends OrderService{


    @Override
    @Tr
    public OrderDTO placeOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage) {
        return null;
    }
}
