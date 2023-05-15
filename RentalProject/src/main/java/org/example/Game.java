package org.example;

import java.util.Date;

public class Game extends Item {
    public String platform;
    public String publisher;

    public Game(String title, String genre, String platform, String publisher, Date releaseDate, long ID) {
        super(title, genre, releaseDate, ID);
        this.platform = platform;
        this.publisher = publisher;
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

    public String getplatform() {
        return platform;
    }

    public String getpublisher() {
        return publisher;
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
