package br.com.webapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
