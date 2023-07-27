// package Array.Easy;

import java.util.Scanner;

public class DifferenceOfSum {

    public static int differenceofSum(int a, int b) {
        int sumNotDivisibleByB = 0;
        int sumDivisibleByB = 0;

        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                sumDivisibleByB += i;
            } else {
                sumNotDivisibleByB += i;
            }
        }

        return sumNotDivisibleByB - sumDivisibleByB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int result = differenceofSum(a, b);
        System.out.println("Output: " + result);

        scanner.close();
    }
}

