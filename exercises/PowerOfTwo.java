package leetcode.exercises;

public class PowerOfTwo {
    public static boolean isPowerOfTwo (int n) {

        int powerMin = 0;
        int powerMax = 31;

        for (int i = 0; i <= powerMax; i++) {

            if (Math.pow(2, powerMin) == n) {
                return true;
            } else {
                powerMin++;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(64));
    }

}