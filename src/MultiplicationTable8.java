import java.util.Scanner;

public class MultiplicationTable8 {

    public static void main(String[] args) {  // declaring main method
        System.out.println("Enter a number ::  "); // to take input from the end user
        Scanner scanner = new Scanner(System.in);  // create a object for scanner class
        int num = scanner.nextInt();  // declaring a local variable
        for (int i = 1; i <= 10; i++){  // declaring a for loop
            System.out.println(""+num+" * " +i+ " = " +(num*i));
        }
    }
}
