package BranchingAndLooping;
import java.util.Scanner;

public class Task2 {
    //Write a program to find the given number is Negative or positive
    public static void main(String[] args) {
        checkPositiveOrNegative();

    }

    public static void checkPositiveOrNegative()
    {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        try {
           int num = scanObj.nextInt();
            if (num >= 0) {
                System.out.println("The Given Number: " + num + " is Positive");
            } else {
                System.out.println("The Given Number: " + num + " is Negative");
            }
        }
        catch  (Exception e){
            System.out.println("The Provided number is not  valid, enter a proper number...");
        }
    }

}
