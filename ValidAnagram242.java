import java.util.*;

public class ValidAnagram242 {
    public static boolean checkAna(String s , String t){
        int sl = s.length();
        int tl = t.length();

        if (sl != tl) {
            return false;
        }

        int[] c = new int[26];

        for (int i = 0; i < sl; i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < tl; i++) {
            c[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 = ");
        String s = sc.next();

        System.out.println("Enter String 2 = ");
        String t = sc.next();

        boolean result = checkAna(s, t);

        if ( result == true) {
            System.out.println("Yes, this is Anagram.");
        }else{
            System.out.println("This is not an Anagram.");
        }
    }
}
