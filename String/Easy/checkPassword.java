// Write a function CheckPassword(str) which will accept the string as an argument or parameter and validates the password. It will return 1 if the conditions are satisfied else it’ll return 0?

// The password is valid if it satisfies the below conditions:

// It should contain at least 4 characters.
// At least 1 numeric digit should be present.
// 1 Capital letter should be there.
// Password should not contain space or slash.
// The starting character should not be a number.

import java.util.*;

public class checkPassword {
    public static int CheckPassword(String str) {
        if (str.length() < 4) return 0; // It should contain at least 4 characters.

        // At least 1 numeric digit should be present.
        boolean isNumeric = false;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                isNumeric = true;
                break;
            }
        }

        if (isNumeric == false) return 0;

        // 1 Capital letter should be there.
        boolean isCapital = false;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                isCapital = true;
                break;
            }
        }

        if (isCapital == false) return 0;

        // Password should not contain space or slash.
        if (str.contains(" ") || str.contains("/")) {
            return 0;
        }

        // The starting character should not be a number.
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String password = sc.nextLine();
        int res = CheckPassword(password);
        if (res == 1) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Not a valid Password");
        }
        sc.close();
    }
}
