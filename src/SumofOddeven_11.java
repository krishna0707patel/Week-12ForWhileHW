import java.util.Scanner;

public class SumofOddeven_11 {
    static int inumber, singlenumber = 0, sum = 0,even = 0, odd =0, sum1=0,sum2=0;
    // declare global variable inside the class but outside the main method


    public static void main(String[] args) {  // declaring main method


        Scanner scanner = new Scanner(System.in); // creating scanner object
        System.out.println("Enter 5 digit no: ");  // to take user input from end user

        inumber = scanner.nextInt(); // declare variable

        if (inumber >= 100000 && inumber <= 99999)
        {
        while(inumber != 0){   // declaring while loop
            int remainder = inumber % 10;
            singlenumber = singlenumber * 10 + remainder;
            inumber = inumber/10;
            sum = sum +remainder;

            if(remainder %2 == 0){
                even = even + 1;
                sum1 = sum1 + remainder;
            }
            else
            {
                odd = odd + 1;
                sum2 = sum2 + remainder;
            }

        }
        //to print in final program
        System.out.println("Total even number = " +even);
        System.out.println("Total odd number = " +odd);
        System.out.println("The sum of the given number is = " +sum);
        System.out.println("Sum of even number = " +sum1);
        System.out.println("Sum of odd number = " +sum2);
    }
        else
        {
            System.out.println("Sorry!! Please enter 5 digit number."); // to print in final program
        }
    }
}
