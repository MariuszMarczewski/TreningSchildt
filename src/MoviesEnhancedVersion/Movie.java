package MoviesEnhancedVersion;

import java.util.Objects;

public class Movie {
    private Long movieId;
    private String title;
    private MovieType movieType;
    private Director director;

    public Movie() {
    }

    public Movie(String name, MovieType movieType, Director director) {
        this.title = name;
        this.movieType = movieType;
        this.director = director;
    }

    public long getMovieId() {
        return movieId;
    }

    public Movie(long movieId, String name, MovieType movieType, Director director) {
        this.movieId = movieId;
        this.title = name;
        this.movieType = movieType;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "name = " + title + '\'' +
                ", movieType = " + movieType +
                ", director = " + director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                movieType == movie.movieType &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, movieType, director);
    }
}
