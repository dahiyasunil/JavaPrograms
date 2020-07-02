import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumOfElements {

    private static int[] arrayOfNumbers;

    public static void main(String[] args) {
        acceptArray();
        System.out.println("Sum of numbers of array : " + sum(arrayOfNumbers));
    }

    public static void acceptArray() {
        Scanner scanForInput = new Scanner(System.in);
        System.out.print("Enter the size of input : ");
        int arraySize = scanForInput.nextInt();

        arrayOfNumbers = new int[arraySize];

        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Value " + (i + 1) + " : ");
            arrayOfNumbers[i] = scanForInput.nextInt();
        }
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
