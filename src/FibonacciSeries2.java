import java.util.Scanner;

public class FibonacciSeries2 {
    public static void main(String[] args) {   // declaring main method
        Scanner scanner  = new Scanner (System.in);   // creating a scanner object
        System.out.println("Enter number of terms: ");  // to take input from the end user
        int n = scanner.nextInt();   // define  local variable
        int first = 0,second = 1, next;  // define local variable
        System.out.println("Fibonacci series is:  ");  // final display output
        int i = 0;
        while (i<n){  // declaring while loop
            if (i<=1)
                next = i;
            else {
                next = first+second;
                first = second;
                second = next;
            }
            System.out.println(next);
            i++; // forward formula
        }
    }
}
