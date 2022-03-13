package pl.lublin.wsei.java.wykl2;
import java.util.Scanner;

public class Main {
     public static void main (String[] args){
         //definiowanie zmiennej wczytywanej z klawiatury:
         Scanner scanner = new Scanner(System.in); //definiowanie scannnera
         System.out.println("Podaj imię: ");
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
        // }







         }
}
