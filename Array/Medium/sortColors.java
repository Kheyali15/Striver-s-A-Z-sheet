// 75. Sort Colors # https://leetcode.com/problems/sort-colors/

import java.util.*;

class sortColors {

    public static void sortColors_(int[] nums, int length) {
        int low = 0,
            high = length - 1,
            mid = 0,
            temp;
        while (mid <= high) {
            switch(nums[mid]) {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter numbers : ");
        for (int i=0 ; i<length ; i++) {
            arr[i] = sc.nextInt();
        }

        sortColors_(arr, length);

        System.out.print("Sorted array : ");
        for (int i=0 ; i<length ; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}