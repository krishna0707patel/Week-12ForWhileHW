import java.util.Scanner;
import java.util.SortedMap;

public class PrimeNumber3 {
 public static boolean isPrime(int N){  // declaring  method  with parameter and object

     for (int i = 2; i < N; i++){  // declaring for loop
         if (N % i == 0){
             return false;
         }
     }
     return true;
 }
    public static void main(String[] args) { // declaring main method
        Scanner scanner = new Scanner(System.in);   // creating scanner object
        System.out.println("Enter Your number to check its Prime or Non Prime number: "); // to take input from the end of user
        int n = scanner.nextInt(); // user read output
         boolean ans = (isPrime(n));
         if (n != 1 && ans == true){  // using if else statement
             System.out.println("Given number\t" +n+ "\tis Prime number."); // display final output
         }else {
             System.out.println("Given number\t" +n+ "\tis  Non Prime number.");  // display final output
         }
    }
}
