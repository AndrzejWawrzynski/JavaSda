import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Podaj zakres tabliczki mnożenia:");
        a = scan.nextInt();
        b = scan.nextInt();

        for (c = a; c <= b; c++) {
            System.out.println("Tabliczka mnożenia dla liczby :" + c);
            for (d = 1; d <= 10; d++) {
                System.out.println(c + " * " + d + " = " + (c * d));
            }
        }
    }
}
