package com.googlerestapi.com.rest;

public class SerializationClass {
	
    String name;
    String releaseDate;
    String category;
    String rating;
    String id;
    int reviewScore;

    public SerializationClass() {
    }
    public SerializationClass(String name, int reviewScore, String releaseDate, String category, String rating, String id) {
        this.name = name;
        this.reviewScore = reviewScore;
        this.releaseDate = releaseDate;

        this.category = category;
        this.rating = rating;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // other getters & setters excluded for brevity

    public String toString() {
        return "Video game " + this.name + " has a release date of: "+this.releaseDate+" has an ID of: " + this.id + ", and a review score of: " + this.reviewScore;
    }
}
