import java.util.Scanner;

public class MaxAdjacentDifference {

    private static int[] arrayOfNumbers;

    public static void main(String[] args) {
        acceptInputArray();
        System.out.println("Max difference : " + maxAdjacentDifference(adjacentDifference(arrayOfNumbers)));
    }

    public static void acceptInputArray() {

        Scanner readInput = new Scanner(System.in);
        System.out.print("Define the size of array : ");
        int arraySize = readInput.nextInt();
        arrayOfNumbers = new int[arraySize];

        System.out.println("Enter the numbers in array : ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Value " + (i + 1) + " : ");
            arrayOfNumbers[i] = +readInput.nextInt();
        }
    }

    private static int[] adjacentDifference(int[] inputArray) {
        int[] adjacentDiff = new int[inputArray.length - 1];
        for (int i = 0; i < inputArray.length - 1; i++) {
            adjacentDiff[i] = Math.abs(inputArray[i] - inputArray[i + 1]);
        }
        return adjacentDiff;
    }

    public static int maxAdjacentDifference(int[] adjDiffArray) {
        int max = 0;
        for (int number : adjDiffArray) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
