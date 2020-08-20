package com.hust.baseweb.applications.order.repo;

import com.hust.baseweb.applications.order.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {
}
