package BranchingAndLooping;
import java.util.Scanner;

public class Task1 {
    static Scanner scanObj = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Write a program to print the numbers from 10 to 50 using for loop/ while loop.
        PrintNUmberFrom10To50UsingFor();
        PrintNUmberFrom10To50usingWhile();
        }


        public static void PrintNUmberFrom10To50UsingFor() {
        //Using For Loop;
            System.out.println("Enter the Starting Number : ");
            int StartNum = scanObj.nextInt();
            System.out.println("Enter the Last Number : ");
            int LastNum = scanObj.nextInt();

            System.out.println("By using For Loop the numbers from '10 to 50' is been printed");
            for (int i = StartNum; i <= LastNum; i++) {
                System.out.println(i);
            }
            System.out.println("");
        }

    public static void PrintNUmberFrom10To50usingWhile() {
        //Using For Loop;
        System.out.println("By using 'while' Loop the numbers from '10 to 50' is been printed");
        System.out.println("Enter the Starting Number : ");
        int StartNum = scanObj.nextInt();
        System.out.println("Enter the Last Number : ");
        int LastNum = scanObj.nextInt();
       int i = StartNum;
       while(i<=LastNum){
           System.out.println(i);
           i++;
       }
        System.out.println("");
    }
}
