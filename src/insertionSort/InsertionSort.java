package insertionSort;

import com.sun.security.jgss.GSSUtil;
import selectionSort.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        System.out.println("Enter the value of the array");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter your choice 1 for Ascending Order \n 2 for Descending Order");
        int choice = scanner.nextInt();
        try{
            InsertionSort insertionsort = new InsertionSort();

            switch (choice) {
                case 1:
                    insertionsort.arrayInAscendingOrder(array, sizeOfArray);
                    System.out.println("Array after soring in Ascending order: " + Arrays.toString(array));
                    break;
                case 2:
                    insertionsort.arrayInDescendingOrder(array, sizeOfArray);
                    System.out.println("Array after soring in Descending order" + Arrays.toString(array));
                    break;
                default:
                    System.out.println("Regret Wrong choice \nYou only have two choices 1 and 2");
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }

    private int[] arrayInDescendingOrder(int[] array, int sizeOfArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            int keyValue = array[i];
            int j = i - 1;
            while(j <= 0 && array[j] < keyValue){
                array[j + 1] = array[j];
                j = j - 1;

            }
            array[j + 1] = keyValue;
        }
        return array;
    }

    private int[] arrayInAscendingOrder(int[] array, int sizeOfArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            int keyValue = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > keyValue){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;
        }

    return array;
    }
}
