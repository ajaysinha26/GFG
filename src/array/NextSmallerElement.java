package array;

import java.util.Stack;

/**
 * Created by ajaysinha on 09/02/19.
 *
 * Program to find Next Smaller Element(NSE) in a given array.
 * NSE of last element is -1. If NSE doesn't exist for an element NSE would be considered as -1
 * For example if array is 4, 8, 5, 2, 25 then NSE would be 4 -> 2, 8 -> 5, 5 -> 2, 2 -> -1, 25 -> -1
 * This prints the NSE in reverse order of the array. If needed to print in order of array we can use an additional storage.
 */
public class NextSmallerElement {

    public static void main(String[] args) {
        int[] array = {4, 8, 5, 2, 25};
//        int[] array = { 11, 13, 21, 3};


        Stack<Integer> stack = new Stack<>();
        for(int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > array[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.println("NSE of " + array[i] + " is -1");
            } else {
                System.out.println("NSE of " + array[i] + " is " + stack.peek());
            }
            stack.push(array[i]);
        }
    }
}
