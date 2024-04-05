package selectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        System.out.println("Enter value of the arrays");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array before sorting " + Arrays.toString(array));
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Enter your choice 1 for Ascending Order and 2 for Descending order");
        int choice = scanner.nextInt();
        try {
            switch (choice) {
                case 1:
                    selectionSort.arrayInAscendingOrder(array, sizeOfArray);
                    System.out.println("Array after soring in Ascending order:\t" + Arrays.toString(array));
                    break;
                case 2:
                    selectionSort.arrayInDescendingOrder(array, sizeOfArray);
                    System.out.println("Array after soring in Descending order:\t" + Arrays.toString(array));
                    break;
                default:
                    System.out.println("Regret Wrong choice \n You only have two choices 1 and 2");
            }
        }
        catch(Exception se){
            System.out.println(se);
            se.printStackTrace();
        }
    }
    private int[] arrayInDescendingOrder(int[] array, int sizeOfArray) {
        int index = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            index = i;
            for (int j = i; j < sizeOfArray; j++) {
                if(array[j] > array[index]) index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    private int[] arrayInAscendingOrder(int[] array, int sizeOfArray) {
        int index = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            index = i;
            for (int j = i; j < sizeOfArray; j++) {
                if(array[j] < array[index]) index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
