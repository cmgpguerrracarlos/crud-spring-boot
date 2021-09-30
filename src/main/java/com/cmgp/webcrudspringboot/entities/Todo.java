package com.cmgp.webcrudspringboot.entities;

import javax.persistence.*;

@Entity
@Table(name ="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idtodo")
    private int idTodo;
    @Column
    private String text;

    public Todo(){}
    
    public Todo(int idTodo,String text){
        this.idTodo = idTodo;
        this.text = text;
    }

    public int getIdTodo(){
        return this.idTodo;
    }

    public int getId(){
        return this.id;
    }

    public String getText(){
        return this.text;
    }

    public void setIdTodo(int idTodo){
        this.idTodo = idTodo;
    }

    public void setText(String text){
        this.text = text;
    }

}
