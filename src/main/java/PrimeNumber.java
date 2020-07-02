public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            System.out.println(isNumberPrime(i));
        }
    }

    public static String isNumberPrime(int number) {
        if (number == 1) {
            return number + " is Prime.";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return number + " is NOT Prime.";
            }
        }
        return number + " is Prime.";
    }
}
