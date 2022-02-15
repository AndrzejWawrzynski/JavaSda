import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą :");
        int number = scan.nextInt();
        int i;
        for (i=1; i<number;i+=2){
            System.out.println("Liczba nieparzysta :" + i);
        }
    }
}
