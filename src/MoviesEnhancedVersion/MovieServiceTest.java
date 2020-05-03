package MoviesEnhancedVersion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieServiceTest {

    private MovieService movieService;

    @Before
    public void init(){
        movieService = new MovieService();
    }

    @Test
    public void shouldReturnTrueIfMovieWasAdded() {
        // given
        Movie movieToAdd = new Movie(6L, "Harry Potter"
                , MovieType.THRILLER, new Director("Kurosawa", 5L));

        // when
        boolean actual = movieService.addMovie(movieToAdd);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseIfNullMovieWasToBeAdded() {

        // when
        boolean actual = movieService.addMovie(null);

        // then
        Assert.assertFalse(actual);
    }

    @Test
    public void shouldReturnTrueIfMovieWasRemoved() {
        // given
        Movie movieToRemove = new Movie(7L, "OneMillionDollar Brain"
                , MovieType.COMEDY, new Director("Blotfeld", 6L));
        movieService.addMovie(movieToRemove);

        // when
        boolean actual = movieService.removeMovie(movieToRemove);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void updateMovie() {
    }

    @Test
    public void getMovies() {
    }

    @Test
    public void findMovieById() {
    }

    @Test
    public void findMovieByTitle() {
    }
}