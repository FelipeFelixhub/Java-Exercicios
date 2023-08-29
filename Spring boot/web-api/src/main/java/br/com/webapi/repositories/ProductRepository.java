package br.com.webapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
