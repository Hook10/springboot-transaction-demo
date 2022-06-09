package net.hookten.springboot.repository;

import net.hookten.springboot.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment, Long> {
}
