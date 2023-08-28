package br.com.webapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
