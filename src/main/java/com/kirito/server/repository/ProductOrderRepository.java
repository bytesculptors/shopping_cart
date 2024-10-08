package com.kirito.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirito.server.models.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {
  List<ProductOrder> findByUserId(Integer userId);
  ProductOrder findByOrderId(Integer orderId);
}
