import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imie :");
        String s = scan.nextLine();
        System.out.println("Twoje imie to :" + s);

        if (s.equals("John Wick")) {
            System.out.println("Widzę, że znów pracujesz John");
        }
        else{
            System.out.println("Witaj :" + s);
        }

    }
}
