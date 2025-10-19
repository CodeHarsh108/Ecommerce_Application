package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsResponse {
    private Long productCount; // Change from String to Long
    private Double totalRevenue; // Change from String to Double
    private Long totalOrders; // Change from String to Long
}
