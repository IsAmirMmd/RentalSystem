import java.lang.reflect.Constructor;
import java.sql.Date;

public class Rental {
    public int ID;
    public Movie movie;
    public Customer customer;
    public Date rentalDate;
    public Date returnDate;

    public Rental(Movie movie, Customer customer, int ID) {
        this.ID = ID;
        this.movie = movie;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Movie getMovie() {
        return movie;
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