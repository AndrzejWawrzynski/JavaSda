//Losowanie liczby z zadanego przedziału

import java.util.Scanner;

public class Zadanie13a {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe początkową zakresu :");
        Scanner userInputMin = new Scanner(System.in);
        int min = userInputMin.nextInt();
        if (min < 0) {
            min = min - 1;
        }
        System.out.println("Podaj liczbę końcową zakresu :");
        Scanner userInputMax = new Scanner(System.in);
        int max = userInputMax.nextInt();
        System.out.println("Losowa liczba z przedziału " + min + " do " + max + ":");
        // funkcja sprawdzajaca wyswietla 30 losowych liczb
        //for (int i = 0; i < 30; i++) {
        double a = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(a);
        //}
    }
}
