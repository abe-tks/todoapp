package com.example.todoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.todoapp.model.Todo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller //コントローラーであることを示すアノテーション
public class TodoController {
    private List<Todo> todos = new ArrayList<>();// ToDoリストを保持するリスト
    
    @GetMapping("/") //ブラウザで "/" にアクセスしたとき、ToDoリストを渡す
    public String index(Model model) {
        model.addAttribute("todos", todos);// モデルにデータを追加
        return "index"; //index.htmlを表示
    }

    @PostMapping("/add") //フォームで入力されたタイトルを追加
    public String addTodo(@RequestParam String title) {
        if (!title.isEmpty()) {
            todos.add(new Todo(title));
        }        
        return "redirect:/";//元のページに戻ります
    }

    @PostMapping("/delete") //指定した番号のToDoを削除
    public String deleteTodo(@RequestParam int index) {
        if(index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
        return "redirect:/";//元のページに戻ります
    }
    
    @PostMapping("/toggle")
public String toggleTodo(@RequestParam int index) { //指定したindexのToDoのdoneを反転
    if (index >= 0 && index < todos.size()) {
        Todo todo = todos.get(index);
        todo.setDone(!todo.isDone());  //反転
    }
    return "redirect:/"; //元のページに戻ります
}
    
    
}
