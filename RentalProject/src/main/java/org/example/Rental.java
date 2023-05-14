import java.util.Date;

public class Rental {
    public long ID;
    public Movie movie;
    public Book book;
    public Game game;
    public Customer customer;
    public Date rentalDate;
    public Date returnDate;

    public Rental(Movie movie, Customer customer, long ID) {
        this.ID = ID;
        this.movie = movie;
        this.customer = customer;
        movie.isAvailable = false;
        this.rentalDate = new Date();
    }

    public Rental(Game game, Customer customer, long ID) {
        this.ID = ID;
        this.game = game;
        this.customer = customer;
        game.isAvailable = false;
        this.rentalDate = new Date();
    }

    public Rental(Book book, Customer customer, long ID) {
        this.ID = ID;
        this.book = book;
        this.customer = customer;
        book.isAvailable = false;
        this.rentalDate = new Date();
    }

    public long getID() {
        return ID;
    }

    public Movie getMovie() {
        return movie;
    }

    public Game getGame() {
        return game;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String calculateFee() {
        long timeDistance = returnDate.getTime() - rentalDate.getTime();
        return ("Your fee is " + timeDistance);
    }
}
