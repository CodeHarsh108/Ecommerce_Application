package com.ecommerce.project.service;

import com.ecommerce.project.payload.AnalyticsResponse;
import com.ecommerce.project.repository.OrderRepository;
import com.ecommerce.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsServiceImpl implements AnalyticsService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public AnalyticsResponse getAnalyticsData() {
        Long productCount = productRepository.count();
        Long totalOrders = orderRepository.count();
        Double totalRevenue = orderRepository.getTotalRevenue();

        return new AnalyticsResponse(
                productCount,
                totalRevenue != null ? totalRevenue : 0.0,
                totalOrders
        );
    }
}
