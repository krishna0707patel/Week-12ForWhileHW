import java.util.Scanner;  // Import scanner class

public class Range10Number1 {
    public static void main(String[] args) { // declaring main method

        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        System.out.println("Enter Starting number:  "); // to take end user input
        int a = scanner.nextInt();  // Read user input
        System.out.println("Enter Ending number:  ");  // to take end user input
        int b = scanner.nextInt();  // read user input
         for (int i = a; i<=b; i++){  // declaring for loop
            System.out.println("Printout:" +i);  // output user input
        }
    }
}
