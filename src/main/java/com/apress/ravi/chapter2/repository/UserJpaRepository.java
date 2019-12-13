package com.apress.ravi.chapter2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import linh.dto.UsersDTO;

@Component
public interface UserJpaRepository extends JpaRepository<UsersDTO, Long> {

	UsersDTO findById(Long id);

	UsersDTO findByName(String name);
}
