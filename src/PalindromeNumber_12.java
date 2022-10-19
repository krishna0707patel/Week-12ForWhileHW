import java.util.Scanner;

public class PalindromeNumber_12 {
    public static void main(String[] args) { // declaring main method
        System.out.println("Enter a number: ");  // to take input from the user

        Scanner scanner = new Scanner(System.in);  // creating scanner object
        int num = scanner.nextInt(); // define variable inside the object


       int reverseNum = 0, remainder; // declare variable

        int originalNum = num; // declare variable inside the main method

        while(num != 0){  // declare while loop
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reverseNum){
            System.out.println(originalNum + "\tis palindrome.");
        }
        else
        {
            System.out.println(originalNum + "\tis not palindrome");
        }
    }
}
