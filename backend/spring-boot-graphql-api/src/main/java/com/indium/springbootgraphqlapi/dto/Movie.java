package com.indium.springbootgraphqlapi.dto;

import java.util.List;

public class Movie {
    private String id;
    private String title;
    private int year;
    private List<String> actors;
    private List<Rating> ratings;

    public Movie() {
    }

    public Movie(String id, String title, int year, List<String> actors, List<Rating> ratings) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.actors = actors;
        this.ratings = ratings;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }

}
