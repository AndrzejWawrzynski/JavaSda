import java.util.Arrays;

public class Zadanie13b {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        //zakres -10 do 10
        int min = -11;//przy zakresie rozpoczynającym się od liczby minusowej musimy podac liczbe o jeden mniejszą
        int max = 10;
        for (int i = 0; myIntArray.length > i; i++) {
            myIntArray[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        int minArray = myIntArray[0];
        int maxArray = myIntArray[0];

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Wartość z tablicy: " + myIntArray[i]);
            if (myIntArray[i] < minArray) {
                minArray = myIntArray[i];
            } else if (myIntArray[i] > maxArray) {
                maxArray = myIntArray[i];
            }
        }
        System.out.println("Zawartość tablicy :" + Arrays.toString(myIntArray));
        System.out.println("Maksimum wynosi: " + maxArray);
        System.out.println("Minimum wynosi: " + minArray);
    }


}

