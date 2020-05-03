package Movies;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MovieRental movieRental = new MovieRental();

        Director spielberg = new Director("Spielberg", 1L);
        Director woo = new Director("Woo", 2L);
        Director scott = new Director("Scott", 3L);
        Director hudson = new Director("Hudson", 4L);

        Movie m1 = new Movie(1L, "Titanic", MovieType.ROMANCE, spielberg);
        Movie m2 = new Movie(2L, "Armageddon", MovieType.THRILLER, scott);
        Movie m3 = new Movie(3L, "48 hours", MovieType.COMEDY, hudson);
        Movie m4 = new Movie(4L, "Ben Hur", MovieType.HISTORICAL, woo);
        Movie m5 = new Movie(5L, "", MovieType.ROMANCE, spielberg);

        movieRental.addMovie(m1);
        movieRental.addMovie(m2);
        movieRental.addMovie(m3);
        movieRental.addMovie(m4);
        movieRental.addMovie(m5);

        List<Movie> movieById = movieRental.findMovieListById(2L);
        System.out.println(movieById);
        System.out.println();

        Movie moviebyId = movieRental.findMoviebyId(2L);
        System.out.println(movieById);
        System.out.println();

        movieRental.updateMovie(3L, new Movie(3L, "Independence Day", MovieType.THRILLER, spielberg));
        Movie moviebyId1 = movieRental.findMoviebyId(3L);
        System.out.println(moviebyId1);

    }
}
