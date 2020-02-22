package day2;

public class JavaFundsDay2 {

    public static void main(String[] args) {
        int[] arrayOfInt = new int[5];

        for(int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = i;
        }

        System.out.println("Prints values from lowest to highest index ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Array element value of index " + i + " " + arrayOfInt[i]);
        }

        System.out.println("Prints from highest to lowest index ");
        for(int i = 4; i >= 0; i--) {
            System.out.println("Array element value of index " + i + " " + arrayOfInt[i]);
        }

        System.out.println("Prints only 3 first elements of array ");
        for(int i = 0; i < 3; i++) {
            System.out.println("Array element value of index " + i + " " + arrayOfInt[i]);
        }

        System.out.println("Always prints all elements of array (enhanced for) ");
        for(int n : arrayOfInt) {
            System.out.println("Element value of array " + n);
        }
    }
}
