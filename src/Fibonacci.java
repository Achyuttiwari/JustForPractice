import java.util.Scanner;

public class Fibonacci {

    static void fibonnaciWithoutRecursion(int count){
        int firstNumber = 1, secondNumber = 1;
        int count1;
        for(int i = 0; i < count; i++){
            if (i == 0) System.out.print(0 + " ");
            else if (i == 1 || i == 2) System.out.print(1 + " ");
            else {
                count1 = firstNumber + secondNumber;
                System.out.print(count1 + " ");       //output: 0 1 1 2 3 5 8 13 21 34
                firstNumber = secondNumber;
                secondNumber = count1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        fibonnaciWithoutRecursion(input);
        scanner.close();
    }
}
