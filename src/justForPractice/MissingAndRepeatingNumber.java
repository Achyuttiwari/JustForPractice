package justForPractice;

import java.util.Scanner;

public class MissingAndRepeatingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        MissingAndRepeatingNumber missingAndRepeatingNumber = new MissingAndRepeatingNumber();
        missingAndRepeatingNumber.printTwoElement(array, size);
        scanner.close();
    }

    public void printTwoElement(int[] array, int size) {
        int[] temp
                = new int[size]; // Creating temp array of size n
        // with initial values as 0.
        int repeatingNumber = -1;
        int missingNumber = -1;

        for (int i = 0; i < size; i++) {
            temp[array[i] - 1]++;
            if (temp[array[i] - 1] > 1) {
                repeatingNumber = array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }

        System.out.println("The repeating number is "
                + repeatingNumber + ".");
        System.out.println("The missing number is "
                + missingNumber + ".");

    }
}
