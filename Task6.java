package BranchingAndLooping;

import java.util.Scanner;

public class Task6 {
    static Scanner scanObj = new Scanner(System.in);
    // patter printing program
    public static void main(String[] args) {
        PrintPattern();
    }
    public static void PrintPattern()
    {
        System.out.println("Enter the NUmber : ");
        int num = scanObj.nextInt();
        int n= num;
        for(int i=num;i>0;i--){
            if(i<=num) {
                for(int k =num;k>n;k--){
                    System.out.print(k);
            }
            for(int j=n;j>0;j--){
                System.out.print(n);
                }
            }
                n=n-1;
            System.out.println();
        }

    }

}
