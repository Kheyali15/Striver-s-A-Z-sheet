import java.util.*;

public class smallLargeSum {

    public static int sum(int[] arr, int size) {
        if (size <= 3 || size == 0) {
            return 0;
        }

        int oddLarge = Integer.MIN_VALUE;
        int oddSecondLarge = Integer.MIN_VALUE;
        int evenLarge = Integer.MIN_VALUE;
        int evenSecondLarge = Integer.MIN_VALUE;

        for (int i=0 ; i<size ; i++) {
            if (i%2 == 0) {
                if (arr[i] > evenLarge) {
                    evenSecondLarge = evenLarge;
                    evenLarge = arr[i];
                } else if (arr[i] > evenSecondLarge && arr[i] != evenLarge) {
                    evenSecondLarge = arr[i];
                }
            } else {
                if (arr[i] > oddLarge) {
                    oddSecondLarge = oddLarge;
                    oddLarge = arr[i];
                } else if (arr[i] > oddSecondLarge && arr[i] != oddLarge) {
                    oddSecondLarge = arr[i];
                }
            }
        }

        return oddSecondLarge + evenSecondLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : "); 
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter numbers : ");
        for (int i=0 ; i<length ; i++) {
            arr[i] = sc.nextInt();
        }
        int res = sum(arr, length);
        System.out.print("Result : " + res);
        sc.close();
    }
}
