package pl.lublin.wsei.java.wykl2;
import java.util.*;

public class Main {
     public static void main (String[] args) {
         /* //definiowanie zmiennej wczytywanej z klawiatury:*/
         Scanner scanner = new Scanner(System.in); //definiowanie scannnera
         /*System.out.println("Podaj imię: ");
         //scanner.nextLine(); //wykorzystanie Scannera - Ctrl+Alt+V, polecenie się zmieni na takie jak poniżej:
         String name = scanner.nextLine();

         System.out.println("Cześć " + name);

         //if
         if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba")|| name.equals("Kuba"))) {
             System.out.println("Jesteś męzczyzną");
         } else if (!name.isEmpty() && name.endsWith("a")) {
             System.out.println("Jesteś kobietą");
         } else {
             System.out.println("Imie nie może być puste");
         }
         //if (!name.endsWith("a")){
             //System.out.println("Jesteś męzczyzną");
        // }*/

         /*System.out.println("podaj swój wiek:");
         int age = scanner.nextInt();
        if (age>=18){
            System.out.println("Jesteś pełnoletni");
        }else{
            System.out.println("Nie jesteś pełnoletni");
        }
        var name="Kamil";*/

         /*String firstname = "Kamil";
         String lastname = "Brzezinski";
         System.out.println(firstname + " " + lastname);*/

        /* int a = 10;
         int b = 3;
         System.out.println(a > b);*/

        // boolean isSkyBlue = true;
        /* if (isSkyBlue) {
             System.out.println("Niebo jest niebieskie");
         }else{
             System.out.println("Niebo nie jest niebieskie");
         }*/

        /* do {
             System.out.println("niebo jest niebieskie");
         }while (isSkyBlue);*/

         /*for (int i = 0; i < 10; i++) {
             if (i==4){
                 break;}
             System.out.println(i);
         }*/

        //FIS BAS APLIKACJA

        /* for (int i = 0; i < 10; i++) {

             System.out.println("Podaj liczbę całkowitą: ");
             int liczba = scanner.nextInt(); // pobiera liczbę
             if (liczba==3) {
                 System.out.println("FIS");
             }else if (liczba==5){
                 System.out.println("BAS");
             }else{
                 System.out.println("Ani FIS ani BAS");
             }
         }*/


        /* for (int i = 0; i < 10; i++) {

             System.out.println("Podaj liczbę całkowitą: ");
             int liczba = scanner.nextInt(); // pobiera liczbę
             if (liczba % 5==0 && liczba % 3==0){
                 System.out.println("FIS i BAS");
             }else if (liczba % 5==0){
                 System.out.println("BAS");
             }else if(liczba % 3==0){
                 System.out.println("FIS");
             }else{
                 System.out.println("Ani FIS ani BAS");
             }
         }*/

         
        // ZGADYWANIE - APLIKACJA LOSUJĄCA LICZBA

        /* //new Random(); - i Ctrl+Alt+V i definiuje mi się nowa zmienna klasy Random jak poniżej
         Random random = new Random(); //zmienna random, Alt Shift Enter żeby dodało klasę Random na górze pliku "import java.util.Random;"
         // random.nextLine(100)+1; - eksrakcja zmiennej - Ctrl+Alt+V, polecenie się zmieni na takie jak poniżej:
         int numberToGuess = random.nextInt(100) + 1;

         boolean wasNumberGuessed=false; 
         while(!wasNumberGuessed){
             System.out.println("Podaj liczbę");
             int userNumber = scanner.nextInt();

            if (userNumber<numberToGuess){
                 System.out.println("Liczba jest za mała");
            }else if(userNumber>numberToGuess) {
                System.out.println("Liczba jest za duża");
            }else{
                 System.out.println("Brawo to jest właściwa liczba");
                 wasNumberGuessed=true;
            }
         }*/


        //TABLICE

         //String[] names= new String[4]; //tworzenie tablicy - koniecznie trzeba zdefiniować jej rozmiar np [4]

        // String names[]= {"Asia", "Kasia", "Marek", "Radek"};


       /*  names[0]="Mariusz"; //inicjalizowanie tablicy
         names[1]="Dominik";
         names[2]="Ola";
         names[3]="Ala";*/

         /*for (int i = 0; i <names.length; i++) { //wypisanie elementów forem
             System.out.println(names[i]);
         }*/

         /*for (String name : names){
             System.out.println(name);
         }*/

// ARRAY LIST
        /* List<String> names = new ArrayList<>();
         names.add("Borys");
         names.add("Tola");
         names.add("Jacek");

         names.remove("Borys");

         System.out.println(names.contains("Tola"));
         System.out.println(names.contains("Kitty"));

         System.out.println(names.get(0));

         System.out.println(names.isEmpty());

         Collections.sort(names);

         for (String name : names) {
             System.out.println(name);
         }*/

//HashSet

       /* Set<String> meals = new HashSet<>();
         meals.add("Pizza");
         meals.add("Salad");
         meals.add("Burger");
         meals.add("Salad");

         for (String meal : meals) {
             System.out.println(meal);
         }

         System.out.println(meals.size());*/

//HashMap

/*Map<String, String> nameToMeal = new HashMap<>();

nameToMeal.put("Ola", "Salad");
nameToMeal.put("Dominik", "Pizza");
nameToMeal.put("Ala", "Burger");
nameToMeal.put("Dominik", "Pasta"); //do Dominika zostanie przypisana Pasta zamiast Pizzy

         System.out.println(nameToMeal.get("Dominik")); //wyświetlanie wartości
         System.out.println(nameToMeal.isEmpty()); // czy pusta?
         nameToMeal.clear(); //czyszczenie
         System.out.println(nameToMeal); //wyświetlenie całe: {Ola=Salad, Ala=Burger, Dominik=Pasta}


        //wyświetlenie kluczy
         nameToMeal.keySet(); //Ctrl Alt V, polecenie zmieni się na takie jak poniżej:
         Set<String> keys = nameToMeal.keySet();

         for (String key : keys) {
             System.out.println(key);
         }

         //wyświetlenie wartości
         nameToMeal.values(); //Ctrl Alt V, polecenie zmieni się na takie jak poniżej:
         Collection<String> values = nameToMeal.values();
         for ( String value : values) {
             System.out.println(value);
         }

         System.out.println(nameToMeal.containsKey("Ola")); //czy Mapa zawiera klucz "Ola"
         System.out.println(nameToMeal.containsValue("Pizza")); //czy Mapa zawiera wartość "Pizza"*/


//PROJEKT APLIKACJI

         //Scanner input= new Scanner(System.in);

var shouldContinue=true;
         //System.out.println(zmienna);


         //new Party(); // crtl alt v i pojawia się to co poniżej
         Party party = new Party();


         while (shouldContinue) {
            System.out.println("Podaj zmienną: ");
            System.out.println("1: pokaż listę gości");
            System.out.println("2: dodaj gościa");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");

            var zmienna = scanner.nextInt();

            switch (zmienna) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> System.out.println("wybrano 3");
                case 4 -> System.out.println("wybrano 4");
                case 5 -> shouldContinue = false;
            }
        }














     }
}
