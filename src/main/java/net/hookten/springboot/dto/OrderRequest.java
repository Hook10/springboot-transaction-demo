package net.hookten.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.hookten.springboot.entity.Order;
import net.hookten.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
