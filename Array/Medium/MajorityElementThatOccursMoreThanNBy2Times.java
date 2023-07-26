import java.util.Scanner;

public class MajorityElementThatOccursMoreThanNBy2Times {

    public static int moores_voting_algo(int[] nums) {
        int count = 0,
            element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
            }

            if (num == element) count++;
            else count--;
        }

        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size : ");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.print("Enter numbers : ");
        for (int i=0 ; i<length ; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = moores_voting_algo(nums);
        System.out.print("So the answer is : " + ans);
        sc.close();
    }
}
