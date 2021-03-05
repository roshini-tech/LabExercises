package com.abc.lab;

import java.util.HashSet;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.abc.lab.Book;

@Entity
@Table(name="author_tbl")
public class Author {
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Book> book=new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	public void addBook(Book book) {
		this.getBook().add(book);
	}	
}
