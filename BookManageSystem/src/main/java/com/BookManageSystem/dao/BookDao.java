package com.BookManageSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.BookManageSystem.entity.Book;
import org.springframework.data.jpa.repository.Query;

public interface BookDao extends JpaRepository<Book,Integer>,JpaSpecificationExecutor< Book> {
    @Query(value="select * from t_book where id = ?1",nativeQuery = true)
    public Book findId(Integer id);
}
