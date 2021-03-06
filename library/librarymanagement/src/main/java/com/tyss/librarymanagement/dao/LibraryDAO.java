package com.tyss.librarymanagement.dao;

import java.util.List;

import com.tyss.librarymanagement.dto.AddBook;
import com.tyss.librarymanagement.dto.BookRequest;
import com.tyss.librarymanagement.dto.Registration;

public interface LibraryDAO {
	
	public boolean userSave(Registration registration);
	
	public Registration login(String name, String pwd);
	
	public boolean bookSave(AddBook book);
	
	public boolean delBook(int id);
	
	public List<AddBook> bookList();
	
	public boolean update(AddBook bean);
	
	public boolean bookRequest(int sno , List<AddBook> books);
	
	public boolean requestBook(BookRequest book);
	
	public List<BookRequest> reqList();
	
	public boolean approve(BookRequest request);
	public boolean reject(int id);
	
	public List<BookRequest> approvedBooks();
	
	public List<Registration> userDeatils();

}
