package com.example.todoapp.model;

public class Todo {
     private String title;
    private boolean done;

    public Todo(String title) {
        this.title = title;
        this.done = false; // 初期は未完了
    }

    // getter / setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public boolean isDone() { return done; }
    public void setDone(boolean done) { this.done = done; }
    
}
