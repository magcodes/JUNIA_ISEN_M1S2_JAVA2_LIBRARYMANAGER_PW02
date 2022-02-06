package isen.java2.library;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Film extends CulturalItems implements Comparable<Film>{
	String director;
	Set<String> actors = new LinkedHashSet<String>();
	
	public Film(String title, String director, Set<String> actors, List<Genre> genres) {
		this.setTitle(title);
		this.director = director;
		this.actors = actors;
		this.genres.addAll(genres);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Set<String> getActors() {
		return actors;
	}

	public void setActors(Set<String> actors) {
		this.actors = actors;
	}
	
	public void print() {
		System.out.print(this.title + " directed by " + this.director + " with ");
		Iterator<String> iterator = actors.iterator();
		while(iterator.hasNext()) {
			 String element = iterator.next();
			 System.out.print(element);
			if(iterator.hasNext()) {
				System.out.print(",");
			}
			else {
				System.out.println("");
			}
		   
		    
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(actors, director);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(actors, other.actors) && Objects.equals(director, other.director);
	}
	
	@Override
	public int compareTo(Film film) {
		return this.title.compareTo(film.getTitle());
	}
	
}


