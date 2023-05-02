import java.util.ArrayList;

public class RentalStore {
    public static ArrayList<Customer> memberStore = new ArrayList<>();
    public static ArrayList<Movie> movieList = new ArrayList<>();
    public static ArrayList<Rental> rentalList = new ArrayList<>();

    public static void register(Customer customer) {
        memberStore.add(customer);
    }

    public static void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public static void removeMovie(Movie movie) {
        if (movie.isAvailable == true)
            movieList.remove(movie);
        else {
            System.out.println("it's not available");
        }
    }

    public static void getAvailableMovies() {
        System.out.println("**** here is list of available movies you can rent : ****");
        int i = 1;
        for (Movie movie : movieList) {
            if (movie.isAvailable == true)
                System.out.println(
                        i + ". " + movie.title + " by " + movie.director + " and it's genre is " + movie.genre);
            i++;
        }
    }

    public static void rentMovie(Movie movie, Customer customer) {
        String ID = Long.toString(movie.ID) + Long.toString(customer.ID);
        long castID = Long.parseLong(ID);
        if (movie.isAvailable == true) {
            Rental rental = new Rental(movie, customer, castID);
            rentalList.add(rental);
            System.out.println(movie.getTitle() + " rented");
        }
    }

    public static void returnMovie(Rental rental) {
        Movie tempMovie = rental.movie;
        tempMovie.isAvailable = true;
    }

    public static Customer getCustomerById(long ID) {
        Customer tempCustomer = null;
        Boolean isExisted = false;
        for (Customer temp : memberStore) {
            if (temp.ID == ID) {
                tempCustomer = temp;
                isExisted = true;
            }
        }
        if (!isExisted) {
            System.out.println("we don't have any user with this ID");
        } else {
            System.out.println("user name is " + tempCustomer.name);
            System.out.println("user email is " + tempCustomer.email);
            System.out.println("user phone is " + tempCustomer.phone);
            tempCustomer.getRentals();
        }
        return tempCustomer;
    }

    public static Movie getMovieById(long ID) {
        Movie tempMovie = null;
        Boolean isExisted = false;
        for (Movie temp : movieList) {
            if (temp.ID == ID) {
                tempMovie = temp;
                isExisted = true;
            }
        }
        if (!isExisted) {
            System.out.println("we don't have any movie with this ID");
        } else {
            System.out.println("movie title is " + tempMovie.title);
            System.out.println("movie director is " + tempMovie.director);
            System.out.println("movie genre is " + tempMovie.genre);
            System.out.println("movie cast is " + tempMovie.cast);
        }
        return tempMovie;
    }

}
