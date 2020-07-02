public class FibonacciSeries {

    private static int fibonacci = 1, fibo1 = 1, fibo2 = 1;

    public static void main(String[] args) {
        printFibonacciSeries(10);
    }

    private static void printFibonacciSeries(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(fibonacciTwo(i) + " ");
        }
    }

    private static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        fibonacci = fibo1 + fibo2;
        fibo1 = fibo2;
        fibo2 = fibonacci;

        return fibonacci;
    }

    public static int fibonacciTwo(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibonacci = 1, fibo1 = 1, fibo2 = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
