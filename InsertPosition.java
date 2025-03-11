package leetcode;

public class InsertPosition {

    public int searchInsert(int[] nums, int target) {

        int inserted = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                inserted = i;
                break;
            } else if (target < nums[i]) {
                inserted = i;
                break;
            } else {
                inserted =  i+1;
            }
        }
        return inserted;
    }
    public static void main(String[] args) {

        InsertPosition i = new InsertPosition();

        int[] nums = {1, 3, 5, 6};

        System.out.println(i.searchInsert(nums, 2 ));





        System.out.println();



    }
}
