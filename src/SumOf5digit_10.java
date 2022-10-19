import java.util.Scanner;

public class SumOf5digit_10 {
    public static void main(String[] args) {  // declarind main method
        int i,numbers = 0, sum = 0;  // define local variable inside the main method
        {
            System.out.println("Enter any 5 numbers:: ");  // to take input from the end user
        }

        for (i=0; i<5; i++) // declaring for loop
        {

            Scanner scanner = new Scanner(System.in); // creating a scanner object
            numbers = scanner.nextInt(); // define a variable

            sum += numbers;
        }
        System.out.println("The sum of 5 no is : " +sum); // it gives final output answer

    }




}
