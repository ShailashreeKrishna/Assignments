package org.example;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.example.model.Book;
import org.example.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {
	 BookService service=null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"called");
	}
	
	@BeforeEach//the common one is use at top like this
	public void setUp(TestInfo info) {
		 service=new BookService();
			System.out.println(info.getDisplayName()+" "+"called");
	}
	
	
	@Test
	@DisplayName(value="Check whether the bookList is null or not")
	
	void testGetBooks() {
		
		//BookService obj=new BookService();
		 Object actual =service.getBookList();
		
		assertNotNull(actual);
	}

	
	@Test
	@DisplayName(value="add method should return 1 for success and 0 for failure to insert")
	
	void testAddBooks() {
		
		//BookService obj1=new BookService();
		
	      int actual=service.addBook(new Book());
	    
	     int expected=0;
	     
	     assertEquals(expected, actual);
	    
	}
	

	
		@Test
		@DisplayName("addBook Method should not Accept Dupilcate")
		void testDuplicateNotAllowed() {
			
		//BookService service=new BookService();
				
	         assertAll("Testing Add Book",
			()->assertEquals(1,service.addBook(new Book(103,"java",450))),
		()->assertEquals(0,service.addBook(new Book(103,"java",450)))
			);
	}

		@Test
		@DisplayName(value="removing book list")
		void testRemove() {
			Throwable exception=
					assertThrows(RuntimeException.class,
							()->service.removeBook(new Book(103,"spring",85))
						
							);
		}
		
		@DisplayName(value="Test if getBestBook method has the value HeadFirst Java in one first Three Positions")
		@ParameterizedTest
		@ValueSource(ints= {0,1,2})
		//if you put wrong windows name the test will skipped
		void testGetBook(int pos) {
			System.out.println(System.getProperty("os.name"));
			
			assumeTrue(System.getProperty("os.name").equals("Windows 8.1"));
			
			assertEquals("Head First Java",service.getBestBook().get(pos));
			
		}
}