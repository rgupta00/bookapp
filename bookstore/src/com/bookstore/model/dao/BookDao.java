package com.bookstore.model.dao;
import java.util.*;
public interface BookDao {
	public void addBook(Book book);
	public void delBook(int id);
	public void updateBook(int id, double price);
	public List<Book> getAllBooks();
	public Optional<Book> getBookById(int id);
	public Optional<Book> getBookByIsbn(String isbn);
}
