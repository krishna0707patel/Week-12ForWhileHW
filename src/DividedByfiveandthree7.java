public class DividedByfiveandthree7 {

    public static void main(String[] args) {  // declaring main method

        System.out.println("\n Divided by 3:: ");// display final result
        for (int i = 1; i<=100;i++){    //declare for loop
            if (i % 3 == 0) System.out.println(i + " , ");
        }
        System.out.println("\n Divided by 5:: "); // display final result
        for (int i = 1; i<=100; i++){     //declare for loop
            if(i % 5 == 0) System.out.println(i+" , ");
        }
        System.out.println("\nDivided by 3 & 5::  "); // display final result
        for (int i = 1; i <= 100; i++ ){     //declare for loop
            if (i % 5 == 0 || i % 3 == 0) System.out.println(i+" , ");
        }
    }
}
