package com.cmgp.webcrudspringboot.service;

import java.util.List;

import com.cmgp.webcrudspringboot.entities.Todo;

public interface TodoService {
    public List<Todo> getAll();
    public void addTodo(Todo todo);
    public Todo findById(int id);
    public int delete(int id);
}
