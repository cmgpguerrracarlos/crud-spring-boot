package com.cmgp.webcrudspringboot.repository;

import com.cmgp.webcrudspringboot.entities.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
    
}
