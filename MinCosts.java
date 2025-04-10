package leetcode;

import java.util.Arrays;

public class MinCosts {

    public static int[] minCosts(int[] cost) {

        int[] result = new int[cost.length];

        for (int i = 0; i < cost.length; i++) {
            result[i] = cost[i];
        }

        for (int i = 0; i < cost.length-1; i++) {
            if (result[i] < result[i+1]) {
                result[i+1] = result[i];
            }

        }


        return result;
    }

    public static void main(String[] args) {

        int[] result = {5, 3, 4 ,1 ,3 ,2};

        System.out.println(Arrays.toString(minCosts(result)));
    }
}
