import java.util.Scanner;

public class PalindromikWords {
    private static final Scanner sc = new Scanner(System.in);


    public static boolean isPolindrom(String word) {
        int left = -1, right = word.length();
        while (++left < --right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.print("Kelime:");
        String word = sc.nextLine();
        System.out.println(isPolindrom(word));


    }
}
