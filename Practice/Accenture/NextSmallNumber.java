// package Practice.Accenture;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallNumber {
    public static int[] nextSmallNumber(int[] arr, int size) {
        int[] nse = new int[size];
        Stack<Integer> st = new Stack<>();
        for (int i=size-1 ; i>=0 ; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (i < size) {
                if (!st.isEmpty()) nse[i] = st.peek();
                else nse[i] = -1;
            }

            st.push(arr[i]);
        }

        return nse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter numbers : ");
        for (int i=0 ; i<size ; i++) {
            arr[i] =sc.nextInt();
        }
        int[] ans = new int[size];
        ans = nextSmallNumber(arr, size);
        System.out.print("Next Smaller element : ");
        for (int i=0 ; i<size ; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
    
}
