//  Write a function OperationChoices(c, a, b) which will accept three integers as an argument, and the function will return:

// (a + b) if the value of c=1.
// (a – b) if the value of c=2.
// (a * b) if the value of c=3.
// (a / b) if the value of c=4.

import java.util.*;

public class OperationChoices {

    public static int operationChoices(int c, int a, int b) {
        switch(c) {
            case 1: 
                return a + b;
            case 2: 
                return a - b;
            case 3:
                return a * b;
            case 4: 
                return a / b;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int result = operationChoices(c, a, b);
        System.out.print("Result : " + result);
        sc.close();
    }
}
