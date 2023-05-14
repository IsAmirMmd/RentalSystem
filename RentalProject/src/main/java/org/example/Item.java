import java.util.Date;

public class Item {
    public Boolean isAvailable = false;
    public String title;
    public String genre;
    public Date releaseDate;
    public long ID;

    public Item(String title, String genre, Date releaseDate, long ID) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ID = ID;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public long getID() {
        return ID;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
