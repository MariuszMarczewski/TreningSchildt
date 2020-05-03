package MoviesEnhancedVersion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepository();
        Movie movieById = movieRepository.findMovieById(1L);
        System.out.println(movieById);
        System.out.println();
        List<Movie> movies = movieRepository.getMovies();
        System.out.println(movies);
        System.out.println();

        List<Movie> movieByGenre = movieRepository.findMovieByGenre(MovieType.THRILLER);
        System.out.println(movieByGenre);
        System.out.println();

    }
}
