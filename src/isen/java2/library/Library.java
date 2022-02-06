package isen.java2.library;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Library {

	List<Film> films;
	List<Book> books;
	
	public Library(){
		this.films = new LinkedList<Film>();
		this.books = new LinkedList<Book>();
	}
	
	public void add(Film film) {
		films.add(film);
	}
	 	
	private  <C extends CulturalItems> void print(List<C> list) {
		for (C c : list) {
			c.print();
		}
	}			
		
	public void add(Book book) {
		books.add(book);
	}
	
	public void printCatalogue() {
		Collections.sort(films);
		System.out.println("Films: \n");
		this.print(films);
		
		Collections.sort(books);
		System.out.println("Books: \n");
		this.print(books);
		
	}
	
	public void searchByGenre(Genre genre) {
		System.out.println("");
		for(Film f : films) {
			if(f.genres.contains(genre)) {
				f.print();
			}
		}
		
		for(Book b: books) {
			if(b.genres.contains(genre)) {
				b.print();
			}
		}
	
	}
	
	
}
