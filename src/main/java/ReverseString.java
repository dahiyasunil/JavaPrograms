public class ReverseString {

    public static void main(String[] args) {
        reverse("Sunil");
        reverseTwoAndPalindrome("Sunil");
        reverseTwoAndPalindrome("level");
    }

    public static void reverse(String input) {
        System.out.println("Input String : " + input);

        char[] charArray = input.toCharArray();

        System.out.print("Reverse String : ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    public static void reverseTwoAndPalindrome(String input) {
        System.out.println("Input String : " + input);

        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString = reversedString + input.charAt(i);
        }
        System.out.println("Reversed String : " + reversedString);

        if (input.equalsIgnoreCase(reversedString)) {
            System.out.println(input + " is Palindrome.");
        } else {
            System.out.println(input + " is NOT Palindrome.");
        }
    }
}