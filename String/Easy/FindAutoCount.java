import java.util.Scanner;

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
        int count = 0, 
            num = Integer.parseInt(str);
        
        if (autobiographical(str)) {
            
        }
        return count;
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
