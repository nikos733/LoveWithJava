package HW2;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"4", "1", "3", "2"}, {"4", "4", "3", "1"}, {"2", "1", "3", "4"}, {"4", "1", "3", "4"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Array Size Exceeded!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Invalid Array Value!");
            System.out.println("Cell Error: " + e.i + "x" + e.j);
        }

    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}