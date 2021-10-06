package com.cmgp.webcrudspringboot.controllers;

import java.util.List;

import com.cmgp.webcrudspringboot.entities.Todo;
import com.cmgp.webcrudspringboot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {
    @Autowired
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getListOfTodo(Model model) {
        List<Todo> fuck = todoService.getAll();
        if(fuck != null)
            model.addAttribute("todo",fuck);
            model.addAttribute("name","Carlos Guerra");
        return "index";
    }

    @GetMapping("/add")
    public String addtodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping("/store")
    public String storeTodo(Todo todo){
        todoService.addTodo(todo);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String editTodo(@PathVariable("id")int id,Model model){
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "addTodo";
    }

    @RequestMapping("/delete/{id}")
    public String deleteTodo(@PathVariable("id") int id){
        todoService.delete(id);
        return "redirect:/";
    }

}

