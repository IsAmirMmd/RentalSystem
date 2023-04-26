import java.sql.Date;
import java.util.ArrayList;

public class Customer {
    public int ID;
    public String name;
    public String email;
    public String phone;
    public String address;
    public ArrayList<Rental> rentals;

    public Customer(String name, String email, String phone, String address, int ID) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }
}
