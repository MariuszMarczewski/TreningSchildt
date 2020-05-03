package MoviesEnhancedVersion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRepository {
    private MovieService movieService;
    private List<Movie> movies = new ArrayList<>();

    Director spielberg = new Director("Spielberg", 1L);
    Director woo = new Director("Woo", 2L);
    Director scott = new Director("Scott", 3L);
    Director hudson = new Director("Hudson", 4L);

    Movie m1 = new Movie(1L, "Titanic", MovieType.ROMANCE, spielberg);
    Movie m2 = new Movie(2L, "Armageddon", MovieType.THRILLER, scott);
    Movie m3 = new Movie(3L, "48 hours", MovieType.COMEDY, hudson);
    Movie m4 = new Movie(4L, "Ben Hur", MovieType.HISTORICAL, woo);
    Movie m5 = new Movie(5L, "", MovieType.ROMANCE, spielberg);


    public MovieRepository(){
        this.movies = Arrays.asList(m1, m2, m3, m4, m5);
    }


    public boolean addMovie(Movie movie) {
        if (movie != null) {
            movies.add(movie);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMovie(Movie movie){
        if (movie != null) {
            movies.remove(movie);
            return true;
        }
        return false;
    }

    public void updateMovie(Movie movieToUpdate, Movie movie){
        int index =  movies.indexOf(movieToUpdate);
        if (index >= 0) {
            movies.set(index, movie);
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie findMovieById(Long movieId){
        return movies.stream()
                .filter(movie -> movieId.equals(movie.getMovieId()))
                .findFirst()
                .get();
    }

    public List<Movie> findMovieByTitle(String title){
        return movies.stream()
                .filter(movie -> movie.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    public List<Movie> findMovieByGenre(MovieType movieType){
        return movies.stream()
                .filter(movie -> movie.getMovieType().equals(movieType))
                .collect(Collectors.toList());
    }

}
