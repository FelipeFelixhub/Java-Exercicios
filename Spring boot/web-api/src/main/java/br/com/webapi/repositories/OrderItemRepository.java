package br.com.webapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webapi.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
