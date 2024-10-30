
/*
 * Q16~WAP to enter a string & count no. of vowels,consonants and other characters.
 */
import java.util.*;

public class Countconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int vowel = 0, consonant = 0, other = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else {
                other++;
            }
        }
        System.out.println("No. of vowels: " + vowel);
        System.out.println("No. of consonants: " + consonant);
        System.out.println("No. of other characters: " + other);
        sc.close();
    }
}
