import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "secretpassword";
        while (true) {
            System.out.println("Podaj haslo :");
            String pass = scan.nextLine();
            if (pass.equals(password)) {
                System.out.println("Poprawne haslo");
                break;
            } else {
                System.out.println(pass);
                System.out.println("Niepoprawne haslo");

            }
        }

    }
}
