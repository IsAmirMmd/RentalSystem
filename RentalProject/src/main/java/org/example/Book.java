package org.example;
import java.util.Date;

class Book extends Item {
    public String author;
    public String publisher;

    public Book(String title, String genre, String author, String publisher, Date releaseDate, long ID) {
        super(title, genre, releaseDate, ID);
        this.author = author;
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

    public String getauthor() {
        return author;
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
