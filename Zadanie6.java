import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Poproszę hasło :");
        String s = scan.nextLine();
        System.out.println("Podane hasło to :" + s);

        if (s.equals("secret")) {
            System.out.println("Witaj w tajnym miejscu");
        }



    }
}
