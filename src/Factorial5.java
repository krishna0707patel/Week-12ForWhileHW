import java.util.Scanner;

public class Factorial5 {

    public static long findFactorial(int number) {  // declaring method
        //declare variable
        long fact = 1;

        for (int i = 1; i <= number; i++) // declare for loop
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) { // declaring main method
     // Declare variables
        int number  = 0;
        long result = 0;
// Create Scanner class object to take input from end user
        Scanner scanner = new Scanner(System.in);
// To take input from end user
        System.out.println("Enter number:  ");
        number = scanner.nextInt();

  // Find the factorial of the given number
        result  = findFactorial(number);

// Display result
        System.out.println("Factorial = " + result);
    }






}
