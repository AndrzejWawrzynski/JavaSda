import java.util.Scanner;

public class Zadanie4d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj true lub false");
        boolean podanaLiczba = scan.nextBoolean();
        System.out.println("Użytkownik wprowadził " + podanaLiczba);
    }
}
