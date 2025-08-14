package com.ecommerce.project.repository;

import com.ecommerce.project.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Repeatable;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
