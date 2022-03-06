package HW3;

import java.util.ArrayList;
import java.util.Arrays;

public class MAINTHIS {

    public static void main(String[] args) {

        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        ArrayList<Integer> arrList = toArrayList(intArr);

        APPLE APPLE1 = new APPLE();
        APPLE APPLE2 = new APPLE();
        APPLE APPLE3 = new APPLE();

        ORANGE ORANGE1 = new ORANGE();
        ORANGE ORANGE2 = new ORANGE();

        BOX<APPLE> BOX1 = new BOX<APPLE>(APPLE1, APPLE2, APPLE3);
        BOX<ORANGE> BOX2 = new BOX<ORANGE>(ORANGE1, ORANGE2);

        System.out.println(BOX1.compare(BOX2));

        BOX<ORANGE> BOX3 = new BOX<ORANGE>();
        BOX2.transfer(BOX3);
    }

    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
