package com.customlists;

import java.time.LocalDate;

public class Book{
	
	

	private int isbn;
	private String name;
	private String writer;
	private LocalDate date;
	private float price;
	
	Book(){
		this.isbn = 0;
		this.name = "";
		this.writer = "";
		this.date=LocalDate.now();
		this.price= 0;
		
	}
	Book(int isbn, String name, String writer,LocalDate date,float price){
		this.isbn = isbn;
		this.name = name;
		this.writer = writer;
		this.date=date;
		this.price= price;
		
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
    
	
	
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		if(this.isbn == book.isbn && this.name.equals(book.name) && this.writer.equals(book.writer) && this.date.equals(book.date) && Float.valueOf(this.price).equals(Float.valueOf(book.price)) )
			return true;
		return false;
	}
	@Override
	public String toString() {
		return isbn+" "+name+" "+writer+" "+date+" "+price;
	}

}
