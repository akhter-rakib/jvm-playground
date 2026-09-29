package com.rakib.interviewPractice;

public class ReverseString {

    public String reverseString(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

/*    fun reverseString(s: String): String {
        if (s.length < 2) {
            return s
        }
        val charArray = s.toCharArray()
        var left = 0
        var right = charArray.size - 1
        while (left < right) {
            val temp = charArray[left]
            charArray[left] = charArray[right]
            charArray[right] = temp
            left++
            right--
        }
        return String(charArray)
    }*/
}
