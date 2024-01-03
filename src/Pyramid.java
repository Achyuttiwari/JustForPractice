import java.util.Scanner;

/**
 * Input: 5
 * Output:
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 */
public class Pyramid {

    static void pyramid(int noOfRows){
        int k = 0;
        for(int i = 1; i <= noOfRows; ++i, k = 0){   // i = 1, noOfRows = 4, i = 2
            for (int j = 1; j <= noOfRows - i; ++j){
                System.out.print(" ");
            }
            while(k != 2 * i - 1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int noOfRows = scanner.nextInt();
        pyramid(noOfRows);
    }
}
