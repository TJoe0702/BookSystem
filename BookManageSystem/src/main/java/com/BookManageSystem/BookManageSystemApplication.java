package com.BookManageSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，即springboot项目的启动类
 */
@SpringBootApplication
public class BookManageSystemApplication {

	public static void main(String[] args) {

		//表示spring应用启动起来
		SpringApplication.run(BookManageSystemApplication.class, args);

	}

}
