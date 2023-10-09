import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

         
        boolean isPangram = isPangram(input);

         
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
         
        Set<Character> characters = new HashSet<>();

         
        for (char c : input.toLowerCase().toCharArray()) {
           
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }

         
        return characters.size() == 26;
    }
}
