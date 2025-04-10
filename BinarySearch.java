package leetcode;

import java.util.Arrays;

public class BinarySearch {

    public static int binarioSearch (int[] n, int target){

        int low = 0;
        int high = n.length-1;

        while (low <= high) {

            int mid = (high + low) / 2;
            int result = n[mid];

            System.out.println("mid: " + result);

            if (result < target) {
                low = mid + 1;
            } else if (result > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] n = {1, 5, 6, 7, 19, 28, 39, 42, 87, 133, 246, 350, 504};

        System.out.println(binarioSearch(n, 87));

        System.out.println(Arrays.binarySearch(n, 87));
    }
}
