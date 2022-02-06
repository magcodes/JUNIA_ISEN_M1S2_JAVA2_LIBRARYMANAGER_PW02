package isen.java2.library;

import java.util.List;

public class Book extends CulturalItems implements Comparable<Book>{
	String author;
	
	public Book(String title, String author, List<Genre> genres) {
		this.title = title;
		this.author = author;
		this.genres.addAll(genres);
	}
	
	public void print() {
		System.out.println(this.title + " written by " + this.author);
	}
	
	@Override
	public int compareTo(Book book) {
		return this.title.compareTo(book.getTitle());
	}
}
