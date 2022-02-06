package isen.java2.library;

import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Film film = new Film("Superman", "Mary", Set.of("Actor1", "Actor2", "Actor3"), List.of(Genre.COMEDY, Genre.SCIENCE_FICTION));
		film.print();
		
		Book book = new Book("I'm in love", "King", List.of(Genre.DRAMA));
		book.print();
		
		Library library = new Library();
		library.add(book);
		library.add(film);
		library.printCatalogue();
		library.searchByGenre(Genre.COMEDY);
		library.searchByGenre(Genre.DRAMA);
		library.searchByGenre(Genre.SCIENCE_FICTION);
	}

}
