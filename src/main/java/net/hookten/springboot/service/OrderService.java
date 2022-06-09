package net.hookten.springboot.service;

import net.hookten.springboot.dto.OrderRequest;
import net.hookten.springboot.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
