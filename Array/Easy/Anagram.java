package Array.Easy;

import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[26];
        for (char ch : str1.toCharArray()) {
            charCount[ch - 'a']++;
        }
        
        for (char ch : str2.toCharArray()) {
            charCount[ch - 'a']--;
        }

        for (int count : charCount) {
            if (count > 0) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2 : ");
        String str2 = sc.nextLine();
        boolean result = anagram(str1, str2);
        if (result) {
            System.out.print("Anagram");
        } else {
            System.out.print("Not anagrams");
        }
        sc.close();
    }
}
