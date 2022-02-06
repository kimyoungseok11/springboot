package com.example.core.demo.service;

import com.example.core.demo.domain.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
