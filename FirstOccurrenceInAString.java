package leetcode;

public class FirstOccurrenceInAString {

    public static int strStr(String haystack, String needle){

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(strStr("a", "a"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("daniel", "el"));

    }
}
