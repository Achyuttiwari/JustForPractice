import java.util.*;
public class SegregationOfZeroAndOne {
    static void segregate0sAnd1s(int array[], int sizeOfTheArray){
        int count = 0;
        int i;
        for(i = 0; i < sizeOfTheArray; i++){
            if(array[i] == 0) ++count;   // count the no. of zero in the given array
        }
        for (i = 0; i < count; ++i){     // print all zero's on the left side

            array[i] = 0;
        }
        for(i = count; i < sizeOfTheArray; ++i){
            array[i] = 1;
        }
        System.out.println(Arrays.toString(array)); // output: [0, 0, 0, 1, 1, 1, 1]

    }
    public static void main(String[] args) {
     int[] array = {0, 1, 1, 0, 1, 0, 1};
     int sizeOfTheArray = array.length;
     segregate0sAnd1s(array, sizeOfTheArray);
    }
}