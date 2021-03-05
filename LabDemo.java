package com.abc.lab;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class LabDemo{


	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();
		

		
		Book book1=new Book();
		book1.setIsbn(1);
		book1.setPrice(100);
		book1.setTitle("alice");
		
		Book book2=new Book();
		book2.setIsbn(2);
		book2.setPrice(150);
		book2.setTitle("fault in our stars");
		
		Author author1=new Author();
		author1.setId(101);
		author1.setName("xyz");
		
		author1.addBook(book1);
		author1.addBook(book2);
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		entityManager.persist(author1);
		
		System.out.println("Added author along with book details to database.");

		txn.commit();
		entityManager.close();		
		factory.close();
		
		
		
		
		
		
	}

}
