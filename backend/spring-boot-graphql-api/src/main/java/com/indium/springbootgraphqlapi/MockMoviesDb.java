package com.indium.springbootgraphqlapi;

import com.indium.springbootgraphqlapi.dto.Movie;
import com.indium.springbootgraphqlapi.dto.Rating;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockMoviesDb {
    private List<Movie> movies;

    public List<Movie> getMovies() {
        if (movies == null) {
            movies = new ArrayList<>();
            movies.add(new Movie("1",
                    "The Shawshank Redemption",
                    1994,
                    List.of("Tim Robbins", "Morgan Freeman"), List.of(new Rating("IMDB", "9.3"), new Rating("Rotten Tomatoes", "91%"))));
            movies.add(new Movie("2",
                    "The Godfather",
                    1972,
                    List.of("Marlon Brando", "Al Pacino"), List.of(new Rating("IMDB", "9.2"), new Rating("Rotten Tomatoes", "98%"))));
            movies.add(new Movie("3",
                    "The Dark Knight",
                    2008,
                    List.of("Christian Bale", "Heath Ledger"), List.of(new Rating("IMDB", "9.0"), new Rating("Rotten Tomatoes", "94%"))));
        }
        return movies;
    }
}
