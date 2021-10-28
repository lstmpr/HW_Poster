package ru.netology.domain;

public class MoviesManager {
    private Movie[] movies = new Movie[0];
    private int countMovie = 10;

    public MoviesManager() {
    }

    public MoviesManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public int getCountMovie() {
        return countMovie;
    }

    public void setCountMovie(int countMovie) {
        this.countMovie = countMovie;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


    public Movie[] getAll() {
        int resultLength;
        if (countMovie < movies.length) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }

        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}
