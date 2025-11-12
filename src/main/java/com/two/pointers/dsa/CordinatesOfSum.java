package com.two.pointers.dsa;

public class CordinatesOfSum {
    static void main() {
        IO.println("Hi from CordinatesOfSum");
        int[] arr = {0, 1, 2, 3, 4, 6};
        int target = 6;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                IO.println("Cordinates found : (" + arr[left] + "," + arr[right] + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        IO.println("No cordinates found whose sum is " + target);
    }
}
