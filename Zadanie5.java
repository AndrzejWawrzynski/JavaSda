import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą :");
        int pierwszaLiczba = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą :");
        int drugaLiczba = scan.nextInt();
        double add = pierwszaLiczba + drugaLiczba; //add - addition
        double sub = pierwszaLiczba - drugaLiczba; //sub - subtraction odejmowanie
        double mul = pierwszaLiczba * drugaLiczba; //mul - multiplication mnożenie
        double div = pierwszaLiczba / drugaLiczba; //div - division dzielenie
        double exp = Math.pow(pierwszaLiczba, drugaLiczba); //exp - exponentiation potęgowanie
        System.out.println("a = " + pierwszaLiczba + ", b =" + drugaLiczba + ", wynik dodawania to :" + add);
        System.out.println("a = " + pierwszaLiczba + ", b =" + drugaLiczba + ", wynik odejmowania to :" + sub);
        System.out.println("a = " + pierwszaLiczba + ", b =" + drugaLiczba + ", wynik mnożenia to :" + mul);
        System.out.println("a = " + pierwszaLiczba + ", b =" + drugaLiczba + ", wynik dzielenia to :" + div);
        System.out.println("a = " + pierwszaLiczba + ", b =" + drugaLiczba + ", wynik potęgowania to :" + exp);
    }
}
