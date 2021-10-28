package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();
    Movie first = new Movie(1, "First", "Horror", true);
    Movie second = new Movie(2, "Second", "Romantic comedy", false);
    Movie third = new Movie(3, "Third", "Drama", true);
    Movie fourth = new Movie(4, "Fourth", "Romantic comedy", false);
    Movie fifth = new Movie(5, "Fifth", "Horror", false);
    Movie sixth = new Movie(6, "Sixth", "Drama", true);
    Movie seventh = new Movie(7, "Seventh", "Romantic comedy", true);
    Movie eighth = new Movie(8, "Eighth", "Drama", true);
    Movie ninth = new Movie(9, "Ninth", "Horror", false);
    Movie tenth = new Movie(10, "Tenth", "Drama", true);
    Movie eleventh = new Movie(11, "Eleventh", "Romantic comedy", false);
    Movie twelfth = new Movie(12, "Twelfth", "Romantic comedy", true);

    @Test
    void shouldSetNameOfMovie() {
        Movie movie = new Movie();
        movie.setName("Film");
        String actual = movie.getName();
        String expected = "Film";

        assertEquals(actual, expected);
    }

    @Test
    void shouldSetId() {
        Movie movie = new Movie();
        movie.setId(6);
        int actual = movie.getId();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void shouldIsPrimiere() {
        Movie movie = new Movie();
        movie.setPremiere(true);

        assertTrue(movie.isPremiere());
    }


    @Test
    void shouldSetHorrorGenre() {
        Movie movie = new Movie();
        movie.setGenre("Horror");
        String actual = movie.getGenre();
        String expected = "Horror";

        assertEquals(actual, expected);
    }

    @Test
    void shouldAddFiveMovie() {
        manager.add(first);
        manager.add(second);
        manager.add(sixth);
        manager.add(eighth);
        manager.add(eleventh);

        manager.getAll();
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{eleventh, eighth, sixth, second, first,};

        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldAddTenMovie() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);
        manager.getAll();
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldAddOneMovie() {

        manager.add(seventh);
        manager.getAll();
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh};

        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldCountIsSeven() {

        manager.add(seventh);
        manager.getAll();
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{seventh};

        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldAddZeroMovie() {

        manager.getAll();
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(actual, expected);

    }


    @Test
    void shouldUseConstructorManagerWithCount() {
        MoviesManager count = new MoviesManager(5);
        assertEquals(5, count.getCountMovie());
    }

    @Test
    void shouldUseConstructorOutputFiveMovie() {
        MoviesManager count = new MoviesManager(5);
        count.add(first);
        count.add(second);
        count.add(third);
        count.add(fourth);
        count.add(fifth);
        count.add(sixth);
        count.add(seventh);
        count.add(eighth);
        count.add(ninth);
        count.add(tenth);
        count.getAll();
        Movie[] actual = count.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(actual, expected);


    }

    @Test
    void shouldSetCountSix() {
        manager.setCountMovie(6);
        int actual = manager.getCountMovie();
        int expected = 6;

        assertEquals(actual, expected);

    }

}