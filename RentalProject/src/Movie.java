import java.util.Date;

class Movie extends Item {

    public String title;
    public String genre;
    public String director;
    public String cast;
    public Date releaseDate;
    public Boolean isAvailable;
    public long ID;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, long ID) {
        super(title, genre, releaseDate, ID);
        this.director = director;
        this.cast = cast;
    }
}
