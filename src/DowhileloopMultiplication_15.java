import java.util.Scanner;

public class DowhileloopMultiplication_15 {
    public static void main(String[] args) { //Declaring Main method

        Scanner scanner = new Scanner(System.in); // create an object for scanner class
        System.out.println("Enter 1st column no.:: "); // to take input from end user
        int x = scanner.nextInt(); //define variable


        System.out.println("Enter 2nd column no.:: "); // to take input from user
        int y = scanner.nextInt();  // define variable

        System.out.println("Enter 3rd column no.:: "); //// to take input from user
        int z = scanner.nextInt();  // define variable


        int i = 1;
        do {     // declaring do while loop
            System.out.println( x*i + " " + y*i + " " + z*i );
            i++;
        }
        while (i <= 7);
    }
}
