package com.devlearning.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}