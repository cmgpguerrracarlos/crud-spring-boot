package com.cmgp.webcrudspringboot.service;

import java.util.List;

import com.cmgp.webcrudspringboot.entities.Todo;
import com.cmgp.webcrudspringboot.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements TodoService{
    
    @Autowired
    private final TodoRepository todoRepository;

    public TodoServiceImp(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAll(){
        return todoRepository.findAll();
    }

    public void addTodo(Todo todo){
        todoRepository.save(todo);
    }

    @Override
    public Todo findById(int id) {
        return todoRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }
}
