package HomeWork;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        NUMBER1("ДО:", array1);
        BRO(array1);
        NUMBER1("ПОСЛЕ:", array1);
        System.out.println("----------------------------");
        int[] array2 = new int[100];
        GOD(array2);
        NUMBER1("ЦИКЛ:", array2);
        System.out.println("----------------------------");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        NUMBER1("ДО:\t", array3);
        DOGS(array3);
        NUMBER1("ПОСЛЕ:\t", array3);
        System.out.println("----------------------------");
        int side = 15;
        int[][] array4 = new int[side][side];
        CRY(array4);
        NUMBER2("РЕЗУЛЬТАТ:", array4);
        System.out.println("----------------------------");
        int[] ASSASSIN = CREED(5, 69);
        NUMBER1("РЕЗУЛЬТАТ:", ASSASSIN);
        System.out.println("----------------------------");
        NUMBER1("MIN & MAX", array3);
        System.out.println("MIN:" + MINIMAL(array3));
        System.out.println("MAX:" + MAXIMAL(array3));
        System.out.println("----------------------------");
        int[] balance = {1, 2, 3, 1, 1, 2, 10};
        System.out.print(Arrays.toString(balance) + " BALANCED? -> ");
        System.out.println(checkBalance(balance));
        Arrays.toString(balance);
        System.out.println("----------------------------");
    }
    public static void NUMBER1(String msg, int[] inputArray) {
        System.out.print(msg + " ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    public static void NUMBER2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int k = 0; k < inputArray[i].length; k++) {
                System.out.print(inputArray[i][k] + " ");
            }
            System.out.println();
        }
    }
    //Test1
    public static void BRO(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }
    //Test2
    public static void GOD(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }
    //Test3
    public static void DOGS(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }
    //Test4
    public static void CRY(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
    //Test5
    public static int[] CREED(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
        return tempArray;
    }
    //Test6
    private static int MINIMAL(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int MAXIMAL(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //Test7
    private static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int k = i +1; k < array.length; k++)
                right += array[k];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }
}
