package array;

/**
 *
 * Given two arrays A and B find if B is a subarray of A or not
 *
 * For example if A = {1, 2, 3, 4, 5} and B = {2, 3, 4} then B is subarray of A
 *
 * A = {1, 2, 3, 4, 5} and B = {2, 3, 6} then B is not subarray of A
 *
 *
 * Created by ajaysinha on 10/02/19.
 */
public class SubarrayCheck {

    public boolean isSubarray(int[] A, int[] B) {
        int i = 0;
        int j = 0;
        while (i < A.length) {
            if(j < B.length && A[i] == B[j]) {
                j++;
                if(j == B.length) {
                    return true;
                }
            } else {
                j = 0;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
//        int[] B = {2, 3, 4};
//        int[] B = {3, 4, 5};
        int[] B = {1, 2, 3, 4, 5};
//        int[] B = {2, 3, 4, 5, 6};
        System.out.println(new SubarrayCheck().isSubarray(A, B));
    }

}
