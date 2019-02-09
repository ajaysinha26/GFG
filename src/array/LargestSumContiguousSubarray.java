package array;

/**
 * Program to find largest sum in a contiguous subarray.
 * For example if array is -2, -3, 4, -1, -2, 1, 5, -3 then largest sum would be 4 + -1 + -2 + 1 + 5 = 7
 *
 *
 * Created by ajaysinha on 09/02/19.
 */
public class LargestSumContiguousSubarray {

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] + currentSum > 0) {
                currentSum += array[i];
                maxSum = Math.max(maxSum, currentSum);
            } else {
                currentSum = 0;
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
}
