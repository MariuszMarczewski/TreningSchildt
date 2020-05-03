package MoviesEnhancedVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    MovieRepository movieRepository = new MovieRepository();

    public boolean addMovie(Movie movie) {
        if (movie != null) {
            movieRepository.getMovies().add(movie);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMovie(Movie movie) {
        if (movie != null) {
            movieRepository.getMovies().remove(movie);
            return true;
        }
        return false;
    }

    public void updateMovie(Movie movieToUpdate, Movie movie) {
        int index =  movieRepository.getMovies().indexOf(movieToUpdate);
        if (index >= 0) {
            movieRepository.getMovies().set(index, movie);
        }
    }

    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    public Movie findMovieById(int movieId) {
        return movieRepository.getMovies().stream()
                .filter(movie -> movie.getMovieId() == movieId)
                .findAny()
                .orElse(null);
    }


    public List<Movie> findMovieByTitle(String title) {
        return movieRepository.getMovies().stream()
                .filter(movie -> movie.getTitle().contains(title))
                .collect(Collectors.toList());
    }
}
