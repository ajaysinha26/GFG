package array;

/**
 * Created by ajaysinha on 10/02/19.
 */
public class InplaceSort0s1s2s {

    public void sort(int[] arr) {
        int n = arr.length;
        int index0 = 0;
        int index2 = n - 1;

        for(int i = 0; i <= index2;) {
            if(arr[i] == 0) {
                swap(arr, i, index0);
                index0++;
                i++;
            } else if(arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, index2);
                index2--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 0, 1, 1, 2, 0, 0, 1, 2, 2, 0};
//        int[] arr = {0, 0, 0, 0, 0};
//        int[] arr = {1, 1, 1, 1, 1};
//        int[] arr = {2, 2, 2, 2, 2};
//        int[] arr = {0, 1, 1, 0, 0, 1, 0};
//        int[] arr = {0, 2, 2, 0, 0, 2, 0};
//        int[] arr = {1, 2, 2, 1, 1, 2, 1};
        int[] arr = {2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1};
        new InplaceSort0s1s2s().sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
