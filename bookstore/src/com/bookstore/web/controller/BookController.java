package com.bookstore.web.controller;
import java.sql.Connection;
import java.util.*;
import java.util.function.Supplier;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImpl;
import com.bookstore.model.dao.ConnectionFactory;
import com.bookstore.model.dao.exception.BookNotFoundException;
import java.util.*;
public class BookController {
	public static void main(String[] args) {
		
		Connection connection=ConnectionFactory.getConnection();
		if(connection!=null)
			System.out.println("sucess");
		
		
		//get by id
		
		BookDao dao=new BookDaoImpl();
		
		//print all the books
		
		//List<Book>books=dao.getAllBooks();
		//books.forEach(b-> System.out.println(b));
		
		
		//Del the book
		//dao.delBook(7);
		
		
		//update the book
		dao.updateBook(3,790);
		System.out.println("updated.....");
		
		
		
		
//		Book book=dao.getBookById(2).orElseThrow(()-> new BookNotFoundException("book not found"));
//		System.out.println(book);
		//
		
//		Book book=dao.getBookByIsbn("1372A").orElseThrow(()-> new BookNotFoundException("book not found"));
//		
//		System.out.println(book);
		
//		
//		Book book=new Book("EW123A", "rich data poor data", "RK", new Date(), 150);
//		dao.addBook(book);
//		System.out.println("---------------");
	}
	

	
}
