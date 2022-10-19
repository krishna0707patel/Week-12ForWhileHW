import java.util.Scanner;

public class ArmstrongNumber_13 {

    public static void main(String[] args) {  // declaring main method
         int originalNum, reminder, result = 0;  // define variable inside the main method
        System.out.println("Enter a number:: ");  // to take end user input

        Scanner scanner = new Scanner(System.in);  // create a scanner object
        int num = scanner.nextInt();  // define variable inside the object

        originalNum = num;

        while (originalNum != 0){ // declare while loop
            reminder = originalNum % 10;
            result += Math.pow(reminder,3);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + "is an Armstrong number."); // final program output
        else
            System.out.println(num + " is not an Armstrong number."); // final program output

    }

}
