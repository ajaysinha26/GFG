package array;

/**
 *
 * Program to find maximum profit by buying and selling any number of times from a given array of stock prices
 *
 * For example if input array is {6, 1, 7, 2, 8, 4} maximum profit will be (7-1) + (8-2) = 12
 *
 * Created by ajaysinha on 10/02/19.
 */
public class MaxProfitBuySellAnyNumberOfTimes {

    public int compute(int[] arr) {
        int n = arr.length;
        if(n < 2) {
            return 0;
        }

        int maxProfit = 0;

        int i = 1;
        int currentMin;
        if(arr[0] >= arr[1]) {
            while (i < n-1 && arr[i] > arr[i+1]) {
                i++;
            }
            currentMin = arr[i];
        } else {
            currentMin = arr[0];
        }

        int currentMax = -1;
        boolean canSell = true;
        while (i < n-1) {
            if(arr[i] <= arr[i+1]) {
                currentMax = arr[i+1];
                canSell = true;
            } else {
                if(canSell) {
                    maxProfit += currentMax - currentMin;
                    canSell = false;
                    currentMax = -1;
                }
                currentMin = arr[i+1];
            }
            i++;
        }

        if(currentMax != -1) {
            maxProfit += currentMax - currentMin;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
//        int[] arr = {6, 1, 7, 2, 8, 4}; // Stock price increasing and decreasing
//        int[] arr = {1, 1, 1, 1, 1, 1}; // Stock price same always
//        int[] arr = {1, 1, 1, 4, 9, 8, 3, 13, 7, 10}; // Stock price increasing and decreasing
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Stock price increasing always
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Stock price decreasing always
        System.out.println(new MaxProfitBuySellAnyNumberOfTimes().compute(arr));
    }
}
