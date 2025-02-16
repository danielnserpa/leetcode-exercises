package leetcode;

public class RomanToInt {

    public int romanToInt(String s) {
        int finalNum = 0;
        int previous = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = 0;

            if (s.charAt(i) == 'I') {
                current = 1;
            } else if (s.charAt(i) == 'V') {
                current = 5;
            } else if (s.charAt(i) == 'X') {
                current = 10;
            } else if (s.charAt(i) == 'L') {
                current = 50;
            } else if (s.charAt(i) == 'C') {
                current = 100;
            } else if (s.charAt(i) == 'D') {
                current = 500;
            } else if (s.charAt(i) == 'M') {
                current = 1000;
            }

            if (current < previous) {
                finalNum -= current;
            } else {
                finalNum += current;
            }
            previous = current;
        }
        return finalNum;
    }
    public static void main (String[]args){

            RomanToInt c = new RomanToInt();

            String num = "XIV";

            int print = c.romanToInt(num);

            System.out.println(print);


        }
    }

