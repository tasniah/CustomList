package com.customlists;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCustomList {
	


	@Test
	public void test() {
		
		CustomList<Book> cs = new CustomList<Book>();
		Book[] bookArray = new Book[10];
		
		bookArray[0] = new Book(5420, "dept", "Michel",LocalDate.of(1978, 2, 20),29);
		bookArray[1] = new Book(1234, "c++", "rahul",LocalDate.of(2010, 1, 20),24);
		bookArray[2] = new Book(5322, "Math", "karim",LocalDate.of(2020, 4, 20),23);
		
		
		Book bk1 =  new Book(5420, "dept", "Michel",LocalDate.of(1978, 2, 20),29);
		Book bk2 = new Book(1234, "c++", "rahul",LocalDate.of(2010, 1, 20),24);
		Book bk3 = new Book(5322, "Math", "karim",LocalDate.of(2020, 4, 20),23);
		
		
		//System.out.println(Arrays.deepToString(bookArray));
		
		cs.add(bk1);
		cs.add(bk2);
		cs.add(bk3);
		
		
		
			for(int i=0; i< bookArray.length;i++) {
				assertEquals(bookArray[i], cs.get(i));
			}
		
		
	}
		

}
