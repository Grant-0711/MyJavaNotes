package org.hxl.algorithm;

/**
 * @author Grant
 * @create 2021-07-08 6:04
 */
public class testLongestPalindrome {
    public static void main(String[] args) {
            String s =  "babad";
        System.out.println(longestPalindrome(s));
    }
    private static String  longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if (len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expandAroundCenter(String s, int start, int end){
        int left = start;
        int right = end;
        while (left >= 0 && right < s.length() &&
                s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
