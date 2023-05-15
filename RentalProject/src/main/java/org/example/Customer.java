
package org.example;

import java.util.ArrayList;

public class Customer {
    public long ID;
    public String name;
    public String email;
    public String phone;
    public String address;
    public ArrayList<Rental> rentals ;

    public Customer(String name, String email, String phone, String address, long ID) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        rentals = new ArrayList<>();
    }

    public long getID() {
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

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }

    public ArrayList<Rental> getRentals() {
        System.out.println("****** " + this.name + " rent these item :" + " ******");
        rentals = new ArrayList<>();
        int i = 1;
        for (Rental temp : RentalStore.rentalList) {
            if (temp.customer.ID== this.ID) {
                rentals.add(temp);
                if (temp.movie == null && temp.game == null)
                    System.out.println(i + ". the book : " + temp.book.title);
                else if (temp.movie == null && temp.book == null)
                    System.out.println(i + ". the game : " + temp.game.title);
                else if (temp.game == null && temp.book == null)
                    System.out.println(i + ". the movie : " + temp.movie.title);
                i++;
            }
        }
        return rentals;
    }

    public void addRent(Rental rental) {
        if(rentals== null)
               rentals = new ArrayList<>();
        rentals.add(rental);
    }
}
