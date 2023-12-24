import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibonacciRecursion(int size){
        if(size == 0) return 0;
        if(size == 1 || size == 2) return 1;
        return fibonacciRecursion(size - 1) + fibonacciRecursion(size - 2);
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) System.out.print(fibonacciRecursion(i) + " ");
        scanner.close();
    }
}
