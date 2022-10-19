
import java.lang.constant.Constable;
import java.util.Scanner;

public class CountAstring_9 {

    public static void main(String[] args) {  // declaring main method
        Scanner scanner = new Scanner(System.in);  // creating scanner object
        int count = 0;    // define local variable
        char character = 'a';  // define local variable
        System.out.println("Enter string name for counting 'a' character:: "); // to take input from the user
        String inputString = scanner.next();

        for(int i = 0;i < inputString.length(); i++){  // declaring for loop
            if (inputString.charAt(i) == character)
            {
                count++;
            }
        }
        System.out.println("Total number of 'a' is = " +count );
    }

}
