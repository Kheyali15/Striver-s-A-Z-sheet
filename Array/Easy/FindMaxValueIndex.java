package Array.Easy;

import java.util.*;

public class FindMaxValueIndex {
    public static void maxInArray(int arr[], int length) {
        int index = 1,
            max = arr[0];
        for (int i=0 ; i<length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.print("Max element : " + max + " and its Index : " + index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int length = sc.nextInt();
        System.out.print("Enter numbers : ");
        int[] arr = new int[length];
        for (int i=0 ; i<length ; i++) {
            arr[i] = sc.nextInt();
        }
        maxInArray(arr, length);
        sc.close();
    }
}
