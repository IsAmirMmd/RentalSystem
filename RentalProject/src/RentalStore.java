import java.util.ArrayList;

public class RentalStore {
    public static ArrayList<Customer> memberStore = new ArrayList<>();
    public static ArrayList<Movie> movieList = new ArrayList<>();

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

    public static String getAvailable() {
        System.out.println("**** here is list of available movies you can rent : ****");
        for (Movie movie : movieList) {
            int i = 1;
            if (movie.isAvailable == true)
                System.out.println(
                        i + ". " + movie.title + " by " + movie.director + " and it's genre is " + movie.genre);
            i++;
        }
        return null;
    }

    public static void rentMovie(Movie movie, Customer customer) {
        String ID = Long.toString(movie.ID) + Long.toString(customer.ID);
        if (movie.isAvailable == true) {
            System.out.println(12);
        }
    }
}
