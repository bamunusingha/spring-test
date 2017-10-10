package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Book;

/**
 * @author : chathuranga
 * Date : 10/10/17
 * Time : 1:18 PM
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

	List<Book> findByReader(String reader);

}
