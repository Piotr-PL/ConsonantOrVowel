import java.util.Scanner;
public class ConsonantOrVowel {
    public static void main(String[] args) {

        boolean isConsonant = false;
        System.out.println("Enter a letter : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> isConsonant = true;
        }
        if (isConsonant) {
            System.out.println(ch + " it's Vowel");
        } else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " it's Consonant");
            else {
                System.out.println("Isn't in alphabet");
            }
        }
    }
}