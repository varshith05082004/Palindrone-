import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker!");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

         
        String processedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        
        if (isPalindrome(processedString)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
