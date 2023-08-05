// package Practice.Accenture;

import java.util.Scanner;

public class MaxEleAndIndex {
    public static void maxEleAndIndex(int[] arr, int size) {
        if (size == 0) return;
        int maxELe = arr[0];
        int index = 0;
        for (int i=0 ; i<size ; i++) {
            if (maxELe < arr[i]) {
                maxELe = arr[i];
                index = i;
            }
        }

        System.out.print("Max Element : " + maxEle + " and index : " + index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0 ; i<size ; i++) {
            arr[i] =sc.nextInt();
        }
        maxEleAndIndex(arr, size);
        sc.close();
    }
}
