package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.List;

//finished importing files...

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\amir\\Desktop\\Ap_Projets\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json");
        AllModels models = gson.fromJson(reader, new TypeToken<AllModels>() {
        }.getType());
        String test = gson.toJson(models);
        RentalStore.memberStore = models.getCustomers();
        RentalStore.gameList = models.getGames();
        RentalStore.movieList = models.getMovies();
        RentalStore.bookList = models.getBooks();
        Customer joshnSmith = models.getCustomers().get(0);
        Customer Emily = models.getCustomers().get(1);
        Customer michaelBrown = models.getCustomers().get(2);

        for (Book tempBook : RentalStore.bookList) {
            if (tempBook.ID == 3) {
                RentalStore.rentBook(tempBook, joshnSmith);
            }
            else if (tempBook.ID == 6) {
                RentalStore.rentBook(tempBook, joshnSmith);
            }
        }
        for (Book tempBook : RentalStore.bookList) {
            if (tempBook.ID == 1) {
                RentalStore.rentBook(tempBook, Emily);
            }
            else if (tempBook.ID == 7) {
                RentalStore.rentBook(tempBook, Emily);
            }
        }
        for (Book tempBook : RentalStore.bookList) {
            if (tempBook.ID == 4) {
                RentalStore.rentBook(tempBook, michaelBrown);
            }
            else if (tempBook.ID == 9) {
                RentalStore.rentBook(tempBook, michaelBrown);
            }
        }
        reader.close();
        models.setCustomers(RentalStore.memberStore);
        Gson writing = new Gson();
        String json = writing.toJson(models);
        String filePath ="C:\\Users\\amir\\Desktop\\Ap_Projets\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}