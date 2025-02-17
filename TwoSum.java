package leetcode;

import java.util.Arrays;

public class TwoSum {

//        public int[] twoSum(int[] nums, int target) {
//
//            int count = 0;
//            int[] numIndex = new int[0];
//
//            for (int i = 0; i < nums.length; i++) {
//
//                if (count == target) {
//                    break;
//                } else if (count + nums[i] > target){
//                    count += 0;
//
//                } else {
//                    count += nums[i];
//                    numIndex = new int[]{nums[i]};
//                }
//            }
//        return numIndex;
//    }

    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {


            int[] array = {1, 5, 7, 9};

            int target = 14;

            int[] result = twoSum(array, target);

        System.out.println(Arrays.toString(result));


    }
}
