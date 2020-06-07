package com.BookManageSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.BookManageSystem.entity.BookType;
import org.springframework.data.jpa.repository.Query;


public interface BookTypeDao extends JpaRepository<BookType,Integer>,JpaSpecificationExecutor< BookType>  {

    @Query(value="select * from t_a_book_type where id = ?1",nativeQuery = true)
    public BookType findId(Integer id);
	
	
	
}
