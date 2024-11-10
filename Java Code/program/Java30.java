// A)  Write a java program to accept a number from a user, if it is zero then throw user 
// defined Exception “Number is Zero”. If it is non-numeric then generate an error 
// “Number is Invalid” otherwise check whether it is palindrome or not.

import java.util.Scanner;

// Custom exception for zero input
class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class Java30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            
            if (number == 0) {
                throw new NumberIsZeroException("Number is Zero");
            }
            
            if (isPalindrome(number)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number is Invalid");
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
