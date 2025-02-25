package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] longestArray = nums1;
        int[] shortestArray = nums2;

        if (nums2.length > nums1.length) {
            longestArray = nums2;
            shortestArray = nums1;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < longestArray.length; i++) {
            for (int j = 0; j < shortestArray.length; j++) {

                if (longestArray[i] == shortestArray[j]) {
                    result.add(longestArray[i]);
                    shortestArray[j] = Integer.MIN_VALUE;
                }
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result.get(i);
        }
    return finalResult;
    }
}
