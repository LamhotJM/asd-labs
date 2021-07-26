package edu.miu.cs.cs525.labs.protection;
import java.util.List;

public class Reviewer {

	List<Movie> movieList;

	public Reviewer(List<Movie> list) {
		movieList = list;
	}

	public void spoilMovieTitle() {
		for (Movie movie : movieList) {
			movie.setTitle("spoiled");
		}
	}

	public void printMovieTiles() {
		for (Movie movie : movieList) {
			System.out.println(movie.getTitle());
		}
	}
}