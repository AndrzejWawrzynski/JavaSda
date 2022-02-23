import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę rat od 6 do 48 :");
        int iloscRat = scan.nextInt();
        System.out.println("Podaj kwote pożyczki od 100 do 10000:");
        int kwotaPozyczki = scan.nextInt();
        float rataPozyczki;
        if (iloscRat >= 6 && iloscRat <= 12) {
            rataPozyczki = (float) ((kwotaPozyczki + (0.025 * kwotaPozyczki)) / iloscRat);
            System.out.println("Kwota pożyczki to :" + kwotaPozyczki);
            System.out.println("Rata pożyczki to :" + rataPozyczki);
        } else if (iloscRat >= 13 && iloscRat <= 24) {
            rataPozyczki = (float) ((kwotaPozyczki + (0.05 * kwotaPozyczki)) / iloscRat);
            System.out.println("Kwota pożyczki to :" + kwotaPozyczki);
            System.out.println("Rata pożyczki to :" + rataPozyczki);
        } else if (iloscRat >= 25 && iloscRat <= 48) {
            rataPozyczki = (float) ((kwotaPozyczki + (0.1 * kwotaPozyczki)) / iloscRat);
            System.out.println("Kwota pożyczki to :" + kwotaPozyczki);
            System.out.println("Rata pożyczki to :" + rataPozyczki);
        } else {
            System.out.println("Podano złe dane");
        }

    }
}
