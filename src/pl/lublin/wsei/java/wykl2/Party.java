package pl.lublin.wsei.java.wykl2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party  {
    private List<Guest>guests=new ArrayList<>(); //private widoczne tylko w obrębie tej klasy tj Party
    Scanner scanner = new Scanner(System.in);


    public void addGuest(){
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek:");
        String meal = scanner.nextLine();

        System.out.println("Podaj nr telefonu:");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin Y/N");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

if (isVeganString.equals("Y")){isVegan=true;
}else {
    isVegan=false;
}
        //new Guest(name, meal, phoneNumber, isVegan); // i dokonuję ekstrakcji za pomocą Ctrl Alt V. Powstaje to co poniżej:
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        guests.add(guest); //spodziewamy się obiektu typu Guest}

    /*public void displayGuests() {
        for (Guest guest : guests) {
            System.out.println(guest);
        }/*
    }

    //String isVeganString= isVegan ? "tak" : "nie";
*/
}}
