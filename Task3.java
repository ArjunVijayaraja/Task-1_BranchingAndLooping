package BranchingAndLooping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter a Number with 3 or 4 digit: ");
        int num = scanObj.nextInt();
        StringBuffer s = new StringBuffer(String.valueOf(num));
        System.out.println("The Actual Number : "+num);
        System.out.println("THe Reversed Number :"+s.reverse());
    }
}

