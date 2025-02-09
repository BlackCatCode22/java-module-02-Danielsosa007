import java.util.Scanner;// https://www.w3schools.com/java/java_user_input.asp

public class ReverseString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter a string to reverse:"); // Prompt the user
        String input = scanner.nextLine(); // Read the user's input

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed); // Output the reversed string

        scanner.close(); // Close the scanner
    }
}
