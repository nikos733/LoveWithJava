package HomeWork;

public class HomeWorkApp {
    //Test1
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("---------------");
        checkSumSign();
        System.out.println("---------------");
        System.out.println();
        System.out.println(printColor(424));
        System.out.println(printColor(12));
        System.out.println("---------------");
        System.out.println(compareNumbers(13,34));
    }

    //Test2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Test3
    public static void checkSumSign() {
        int a = 1000;
        int b = 100;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Summa positive");
        } else {
            System.out.println("Summa negative");
        }
    }

    //Test4
    public static String printColor(int value) {
        if (value <= 0) {
            return "RED";
        } else if (value > 0 && value <= 100) {
            return "YELLOW";
        } else {
            return "GREEN";
        }
    }

    //Test5
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }
}
