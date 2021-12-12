package HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("ИТОГ -> " + checkNumbers(3, 10));
        System.out.println("--------------");
        isPositive1(-100);
        System.out.println("--------------");
        String result =(isPositive2(30)) ? "POSITIVE" : "NEGATIVE";
        System.out.println(result);
        System.out.println("--------------");
        methodPrintStringCount("WATCH DOGS", 8);
        System.out.println("--------------");
        int currentYear = 2020;
        System.out.println("YEAR " + currentYear + " -> " + isLeapYear(currentYear));
    }
    //Test1
    public static boolean checkNumbers(int first, int second) {
        int sum = first + second;
        return (sum <= 20) && (sum >= 10);
    }
    //Test2
    public static void isPositive1(int variable) {
        if (variable >= 0) {
            System.out.println(variable + " -> POSITIVE");
        } else {
            System.out.println(variable + " -> NEGATIVE");
        }
    }
    //Test3
    public static boolean isPositive2(int variable) {
        return variable <= 0;
    }
    //Test4
    public static void methodPrintStringCount(String value, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("№" + i +" - " + value);
        }
    }
    //Test5
    public static boolean isLeapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
