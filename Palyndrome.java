package leetcode;

public class Palyndrome {

    public static boolean isPalindrome (int x) {

        String str = String.valueOf(x);

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
        }

    public static void main(String[] args) {

        int num = 121;

        System.out.println(isPalindrome(num));


    }
}
