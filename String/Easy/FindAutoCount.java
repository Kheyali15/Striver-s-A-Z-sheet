import java.util.*;

public class FindAutoCount {
    public static boolean autobiographical(String str) {
        int num = Integer.parseInt(str);
        int i;
        int[] freq = new int[10];
        for (i = 0; i < 10; i++)
          freq[i] = 0;
     
        while (num > 0) {
          freq[num % 10]++;
          num /= 10;
        }
     
        for (i = 0; i < str.length(); i++)
          if (freq[i] != str.charAt(i) - '0')
            return false;
     
        return true;
    }

    public static int findAutoCount(String str) {
        int num = Integer.parseInt(str);
        
        Set<Integer> set = new HashSet<>();

        if (autobiographical(str)) {
            while (num > 0) {
              int r = num % 10;
              set.add(r);
              num /= 10;
            }

            return set.size();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        int res = findAutoCount(str);
        System.out.print("Result : " + res);
        sc.close();
    }
    
}
