package com.two.pointers.dsa;

import java.util.Scanner;

public class PalindromeNumber {
    static void main() {
        IO.println("Hi from PalindromeNumber");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        IO.println("Input String: " + str);
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }else{
                left++;
                right--;
            }
        }
        IO.println("Input String: " + str +" is a :"+ isPalindrome);
    }
}
