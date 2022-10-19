import java.util.Scanner;

public class Reversedigit4 {
    public static void main(String[] args) { // declaring main method
        System.out.println("Enter a number: ");  // to take  end user input
        Scanner scanner = new Scanner(System.in);  // creating scanner object
        int number = scanner.nextInt();  // declare local variable
        int reverse = 0; // declare local variable
        while(number != 0){  // declare while loop
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse); // display final output
    }

}
