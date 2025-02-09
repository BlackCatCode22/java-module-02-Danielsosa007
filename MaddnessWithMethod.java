import java.util.Scanner;//  https://www.w3schools.com/java/java_user_input.asp

public class MaddnessWithMethod
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Get two integers from the user
        System.out.println("Enter the first integer:");
        int num1 = getAnIntFromTheUser(scanner);

        System.out.println("Enter the second integer:");
        int num2 = getAnIntFromTheUser(scanner);

        // Compare the two integers
        compareTwoInts(num1, num2);

        // Calculate and display the sum of the two integers
        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of the two integers is: " + sum);

        scanner.close(); // Close the Scanner
    }

    // Function to get an integer from the user
    public static int getAnIntFromTheUser(Scanner scanner) {
        return scanner.nextInt(); // Read and return the user's input
    }

    // Function to compare two integers and print the comparison result
    public static void compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }

    // Function to calculate and return the sum of two integers
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2; // Add the two numbers and return the result
    }
}
