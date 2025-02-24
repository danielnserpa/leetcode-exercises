package leetcode;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int numberMissing = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (numberMissing == nums[i]) {
                numberMissing++;
            }

        }
        return numberMissing;
    }

    public static void main(String[] args) {

            int[] nums = {3, 4, 5, 6, 7, 9, 2, 1, 0, 11, 12, 8};

            MissingNumber solution = new MissingNumber();

            int result = solution.missingNumber(nums);

        System.out.println(result);



    }
    }

