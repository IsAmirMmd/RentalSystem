package org.example;

import java.util.Date;

class Movie extends Item {
    public String director;
    public String cast;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, long ID) {
        super(title, genre, releaseDate, ID);
        this.director = director;
        this.cast = cast;
        this.isAvailable = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    @Override
    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public long getID() {
        return ID;
    }

    @Override
    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
