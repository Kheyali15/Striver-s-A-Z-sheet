import java.util.Scanner;

public class CalculateBinaryOperations {

    public static int calculateBinaryOperations(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int result = 0;
        char operator = 'A';

        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);

            if (operator == 'A' || operator == 'B' || operator == 'C') {
                operator = ch;
            } else {
                int number = Integer.parseInt(Character.toString(ch), 2);

                switch (operator) {
                    case 'A':
                        result &= number;
                        break;
                    case 'B':
                        result |= number;
                        break;
                    case 'C':
                        result ^= number;
                        break;
                    default:
                        break;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int result = calculateBinaryOperations(str);
        System.out.println("Result: " + result);
        sc.close();
    }
}
