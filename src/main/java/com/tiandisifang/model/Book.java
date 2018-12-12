package com.tiandisifang.model;

public class Book {
	private int id;
	private String bookname;
	private String bookinformation;
	private int bookprice;
	private int booktypes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookinformation() {
		return bookinformation;
	}
	public void setBookinformation(String bookinformation) {
		this.bookinformation = bookinformation;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public int getBooktypes() {
		return booktypes;
	}
	public void setBooktypes(int booktypes) {
		this.booktypes = booktypes;
	}
	public Book(int id, String bookname, String bookinformation, int bookprice, int booktypes) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.bookinformation = bookinformation;
		this.bookprice = bookprice;
		this.booktypes = booktypes;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", bookinformation=" + bookinformation + ", bookprice="
				+ bookprice + ", booktypes=" + booktypes + ", getId()=" + getId() + ", getBookname()=" + getBookname()
				+ ", getBookinformation()=" + getBookinformation() + ", getBookprice()=" + getBookprice()
				+ ", getBooktypes()=" + getBooktypes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
