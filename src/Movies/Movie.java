package Movies;

import java.util.Objects;

public class Movie {

    private long movieId;
    private String name;
    private MovieType movieType;
    private Director director;

    public Movie() {
    }

    public Movie(String name, MovieType movieType, Director director) {
        this.name = name;
        this.movieType = movieType;
        this.director = director;
    }

    public long getMovieId() {
        return movieId;
    }

    public Movie(long movieId, String name, MovieType movieType, Director director) {
        this.movieId = movieId;
        this.name = name;
        this.movieType = movieType;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' +
                ", movieType = " + movieType +
                ", director = " + director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) &&
                movieType == movie.movieType &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, movieType, director);
    }
}
