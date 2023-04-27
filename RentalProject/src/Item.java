import java.util.Date;

public class Item {
    public String title;
    public String genre;
    public Date releaseDate;
    public long ID;

    public Item(String title, String genre, Date releaseDate, long ID) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ID = ID;
    }
}
