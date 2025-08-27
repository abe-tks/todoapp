package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Spring Bootアプリに必要な設定をまとめたアノテーション
public class TodoappApplication {

	public static void main(String[] args) {
		 //Spring Bootを起動する
		SpringApplication.run(TodoappApplication.class, args);
	}

}
