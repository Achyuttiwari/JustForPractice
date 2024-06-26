package justForPractice;
/**
 * Find Maximum element in an array such that its previous and next element product is maximum
 * Example 1:
 * input: arr[] = {5, 6, 4, 3, 2}
 * Output: 6
 * The product of the next and the previous elements
 * for every element of the given array are:
 * 5 -> 2 * 6 = 12
 * 6 -> 5 * 4 = 20
 * 4 -> 6 * 3 = 18
 * 3 -> 4 * 2 = 8
 * 2 -> 3 * 5 = 15
 * Out of these 20 is the maximum.
 * Hence, 6 is the answer.
 * output: Out of all "6" is the Maximum.
 * Example2:
 * Input: arr[] = {9, 2, 3, 1, 5, 17}
 * Output: Out of all "17" is the Maximum.
 */
public class productOfNextAndPreviousNumberMax {
    public static void main(String[] args) {
        int[] array = {5, 6, 4, 3, 2};
        int lengthOfArray = array.length;
        System.out.println("Out of all \""+ maxElement(array, lengthOfArray) + "\" is the Maximum.");

    }

    private static int maxElement(int[] array, int lengthOfArray) {

        if (lengthOfArray < 3) return -1;

        int maxElement = array[0];
        int currProduct;
        int maxProduct = array[lengthOfArray - 1] * array[1];

        for (int i = 1; i < lengthOfArray; i++) {
            currProduct = array[i - 1] * array[(i + 1) % lengthOfArray];

            if (currProduct > maxProduct) {
                maxProduct = currProduct;
                maxElement = array[i];
            }
            else if(currProduct == maxProduct)
                maxElement = Math.max(maxElement, array[i]);
        }
        return maxElement;

    }
}
