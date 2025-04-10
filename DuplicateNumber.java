package leetcode;

public class DuplicateNumber {

    public static int findDuplicate(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i != j && nums[j] == nums[i]) {
                    result = nums[i];
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));

    }
}
