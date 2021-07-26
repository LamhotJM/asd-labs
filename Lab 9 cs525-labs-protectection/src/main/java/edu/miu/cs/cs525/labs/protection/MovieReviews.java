package edu.miu.cs.cs525.labs.protection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MovieReviews {
	public static void main(String[] args) {
		new MovieReviews().run();
	}

	public void run() {
		Reviewer reviewer = new Reviewer(buildMovieList());
		try {
			reviewer.spoilMovieTitle();
		} catch (Exception e) {
			System.out.println("operation not permitted.");
		}
		reviewer.printMovieTiles();
	}

	public List<Movie> buildMovieList() {
		List<Movie> movieList = new ArrayList<Movie>();

		Movie forrestGumpMovie = new MovieImpl("Forrest Gump");
		InvocationHandler forrestGumpHandler = new InvocationHandlerImpl(forrestGumpMovie);
		Movie forrestGumpProxy = (Movie) Proxy.newProxyInstance(Movie.class.getClassLoader(), 
			new Class[]{Movie.class}, forrestGumpHandler);

		Movie djangoMovie = new MovieImpl("Django");
		InvocationHandler djangoHandler = new InvocationHandlerImpl(djangoMovie);
		Movie djangoProxy = (Movie) Proxy.newProxyInstance(Movie.class.getClassLoader(), 
			new Class[]{Movie.class}, djangoHandler);

		movieList.add(forrestGumpProxy);
		movieList.add(djangoProxy);

		return movieList;
	}
}
