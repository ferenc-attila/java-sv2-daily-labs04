package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    Movie movie = new Movie("Titanic", 1996);;

    @BeforeEach
    void initMovie() {
        movie.addActor(new Actor("Leonardo di Caprio", 1974));
        movie.addActor(new Actor("Anette Olson", 1989));
        movie.addActor(new Actor("Jack Doe", 1968));
        movie.addActor(new Actor("John Doe", 1959));
    }

    @Test
    void actorsInTheirTwentiesTest() {
        assertEquals(2, movie.actorsInTheirTwenties());
    }
}
