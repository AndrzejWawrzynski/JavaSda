public class Zadanie15 {
    public static void main(String[] args) {
        int number = 123456789, reverse = 0;
        System.out.println("Liczba do odwrócenia to :" + number);
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}