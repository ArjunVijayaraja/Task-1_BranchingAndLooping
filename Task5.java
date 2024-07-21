package BranchingAndLooping;

import java.util.Scanner;

public class Task5 {
    static Scanner scanObj = new Scanner(System.in);
    static float disc1 = 10;
    static float disc2 = 20;

    public static void main(String[] args) {
       calcTotAmt();
    }

    public static void calcTotAmt(){
        System.out.println("Enter the Purchase Amount : ");
        float Amt = scanObj.nextInt();
        float TotalPayableAmount = 0;
        if(Amt<500){
            System.out.println("No Discount is Applicable for the AMount lesser than : Rs 500");
            TotalPayableAmount = Amt;
            System.out.println("The total Payable amount is : "+TotalPayableAmount);
        }else if(Amt>=500 && Amt <1000){
            System.out.println("10% Discount is Applicable for the AMount between 500 and 1000");
            System.out.println("The total Payable amount before discount is : "+Amt);
            TotalPayableAmount = (Amt-Amt*(disc1/100));
            System.out.println("The total Payable amount after Discount is : "+TotalPayableAmount);
        } else if(Amt>=1000){
            System.out.println("20% Discount is Applicable for the AMount greater than 1000");
            System.out.println("The total Payable amount before discount is : "+Amt);
            TotalPayableAmount = (Amt-Amt*(disc2/100));
            System.out.println("The total Payable amount after Discount is : "+ TotalPayableAmount);
        }
    }
}
