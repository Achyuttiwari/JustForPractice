package main;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[scanner.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + " ");
        }
    }
}
