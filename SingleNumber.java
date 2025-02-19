package leetcode;

public class SingleNumber {

    public int singleNumber (int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            index ^= nums[i];


        }
        return index;
    }

    public static void main(String[] args) {

        int[] array = {1,1,4,5,6,7,7,5,4,6,7,5,4,3,2,4,5,7,3};

        SingleNumber single = new SingleNumber();

        System.out.println(single.singleNumber(array));

    }
}
