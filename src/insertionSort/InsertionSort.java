package insertionSort;

import com.sun.security.jgss.GSSUtil;

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
        try{
            InsertionSort insertionsort = new InsertionSort();
            insertionsort.arrayInAscendingOrder(array, sizeOfArray);
            System.out.println(Arrays.toString(array));
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
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
