package br.com.webapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
