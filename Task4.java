package BranchingAndLooping;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int n1 = scanObj.nextInt();
        System.out.println("Enter the Second Number : ");
        int n2 = scanObj.nextInt();
        System.out.println("Enter the Third number : ");
        int n3 = scanObj.nextInt();

        if(n1<n2 && n1<n3){
            System.out.println(n1+" is the smallest Number");
        } else if (n2<n1 && n2<n3) {
            System.out.println(n2+" is the smallest Number");
        } else if(n3<n1 && n3<n2){
            System.out.println(n3+" is the smallest number");
        }
    }


}
