package Movies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRental {

    private List<Movie> movies;

    public MovieRental() {
        this.movies = new ArrayList<>();
    }

    public boolean addMovie(Movie movie) {
        if (movie != null) {
            movies.add(movie);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMovie(Movie movie) {
        if (movie != null) {
            movies.add(movie);
            return true;
        } else {
            return false;
        }
    }

    public void updateMovie(long id, Movie movie) {
        movies.remove(findMoviebyId(id));
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Movie> findMovieListById(long id) {
        return movies.stream()
                .filter(movie -> movie.getMovieId() == id).collect(Collectors.toList());
    }

    public Movie findMoviebyId(long id) {
        Movie movie = null;
        for (Movie m : movies) {
            if (m.getMovieId() == id) {
                movie = m;
            }
        }
        return movie;
    }

    @Override
    public String toString() {
        return "movies = " + movies;
    }
}
