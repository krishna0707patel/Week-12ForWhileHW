import java.util.Scanner;

public class FirstandlastDigitsum_14 {

    public static void main(String[] args) {  // declaring main method
        int  sum =0, firstdigit = 0, lastdigit = 0, singledigit = 0; // define local variable inside the main method

        System.out.println("Enter 5 digit:: ");
        Scanner scanner = new Scanner(System.in); // creating Scanner object
        int iNum = scanner.nextInt();  // define variable in object

        lastdigit = iNum % 10;

        while (iNum != 0)  // declaring while loop
        {
            for (int i=1;i<=5;i++)  // declaring for loop
            {
                int remainder = iNum % 10;
                singledigit = singledigit * 10 + remainder;
                iNum = iNum / 10;
                sum = sum + remainder;
                if(i==1)
                {
                    lastdigit = remainder;
                    lastdigit=lastdigit;
                    System.out.println("lastdigit: " + lastdigit);
                }
                else if (i == 5)
                {
                    firstdigit = remainder;
                    System.out.println("firstdigit: " + firstdigit);
                    firstdigit=firstdigit;
                }
            }
        }
        int total = firstdigit + lastdigit;

        System.out.println("Sum of the firstdigit & lastdigit is:: " +total);  // final program output
    }
}





