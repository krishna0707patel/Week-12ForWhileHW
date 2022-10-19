import java.util.Scanner;

public class SumofNaturalnumbers6 {
    public static void main(String[] args) {  // declaring main method
        int sum = 0;  // define variable
        System.out.println("Enter your n Natural number value:::  ");  // to take end user input
        Scanner scanner = new Scanner(System.in);  // creating scanner object
        int n = scanner.nextInt();  // declare local variable

        for (int i = 0; i <= n; i++){  // devlaring for loop
            sum = sum + i;
        }
        System.out.println("Sum of n numbers is:: " + sum);  // display final output
    }

}
