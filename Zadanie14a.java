import java.util.Scanner;

public class Zadanie14a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scan.nextInt();
        System.out.println("Tabliczka mnożenia dla liczby :" + number);
        int multiplication;
        int i;
        for(i=1;i <= number; i++){
            multiplication = i * number;
            System.out.println(number + " * " + i + " = " + multiplication);
        }

    }
}
