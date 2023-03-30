package leetcode;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(ispalindrome(x));
    }

    public static boolean ispalindrome(int x){
        String s = String.valueOf(x);
        if(s.length() < 0) return false;
        if(s.length() < 1) return false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse().toString();
        System.out.println("stringBuilder = "+stringBuilder);

        System.out.println("s= "+s);
        if(!s.equals(stringBuilder)) return false;

        return true;
    }
}
