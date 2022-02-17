import java.util.Scanner;

public class Zadanie15a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę do odwrócenia :");
        long number = scan.nextLong();
        long reverse = 0;
        System.out.println("Liczba do odwrócenia to :" + number);
        while (number != 0) {
            long remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Liczba po odwróceniu to :" + reverse);
    }
}
