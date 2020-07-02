public class StarPatterns {

    public static void main(String[] args) {
        //pyramidOne();
        //pyramidTwo();
        //pyramidThree();
        //pyramidFour();
    }

    private static void pyramidOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pyramidTwo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pyramidThree() {
        for (int i = 0; i < 5; i++) {

            for (int j = 5 - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pyramidFour() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
