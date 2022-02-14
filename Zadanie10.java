import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić ?");
        int s = scan.nextInt();
        for (int i = 1; i <= s; i++) {
            System.out.println("To jest " + i + " komunikat w pętli");
        }
    }
}
