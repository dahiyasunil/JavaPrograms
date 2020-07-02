public class MinMaxMultiDimensionalArray {

    private static int[][] input = {{10, 4, 5}, {3, 4, 7}, {7, 11, 2}};
    private static int min, max;

    public static void main(String[] args) {
        System.out.println("Minimum Number in 2D Array : " + findMinimumNumber(input));
        System.out.println("Maximum Number in 2D Array : " + finsMaximumNumber(input));
    }

    private static int findMinimumNumber(int[][] input) {
        min = input[0][0];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] < min) {
                    min = input[i][j];
                }
            }
        }
        return min;
    }

    public static int finsMaximumNumber(int[][] input) {
        max = input[0][0];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }
        return max;
    }
}