package isen.java2.library;

import java.util.Collection;
import java.util.HashSet;

public abstract class CulturalItems {
	String title;
	Collection<Genre> genres = new HashSet<Genre>();
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Collection<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Collection<Genre> genres) {
		this.genres = genres;
	}

	public abstract void print();
		
}

