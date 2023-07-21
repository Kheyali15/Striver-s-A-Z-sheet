// 1. Two Sum # https://leetcode.com/problems/two-sum/

import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0 ; i<arr.length ; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i};
            } else {
                map.put(arr[i], i);
            }
        }

        return new int[] {};
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

        System.out.print("Enter given sum : ");
        int target_sum = sc.nextInt();

        int[] result = new int[2];
        result = twoSum(arr, target_sum);

        if (result.length != 0) {
            System.out.print("The indices of the elements are: " + "(" + result[0] + "," + result[1] + ")");
        } else {
            System.out.print("No such points found");
        }
        sc.close();
    }
}