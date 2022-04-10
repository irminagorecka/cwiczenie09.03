package pl.lublin.wsei.java.wykl2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party  {
    private List<String>guests=new ArrayList<>(); //private widoczne tylko w obrębie tej klasy tj Party
    Scanner scanner = new Scanner(System.in);


    public void addGuest(){
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        guests.add(name);
    }

    public void displayGuests() {
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
