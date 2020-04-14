/*
Basic Calculator 1.0 Program
Created On,at & By: intelliJ Idea Pro,13 April 2020 & Harshvardhan Singh
*/
package Pack1;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to Calculator 1.0 program!");
        boolean DoNotWantToBreak=true;
        while (DoNotWantToBreak)
        {
            System.out.print("Press a to addition,\n  s to substract" +
                    "\n\tm to multiply" +"\n\t  d to divide\n\t\t " +
                    "press ENTER or any key to exit: ");
            String respon=in.nextLine().toLowerCase();
            System.out.println();
            if(respon.equals("a"))
                addition(in);
            else if(respon.equals("s"))
                substract(in);
            else if(respon.equals("m"))
                multiplication(in);
            else if(respon.equals("d"))
                division(in);
            else
                DoNotWantToBreak=false;
        }
        System.out.println("Calculator closed Successfully!");
    }
    static void division(Scanner in) {
        int n1,n2;
        System.out.print("Enter First Number: ");
        n1=in.nextInt();
        System.out.print("Enter Second Number: ");
        n2=in.nextInt();
        System.out.println("After Division: "+(float)n1/n2+"\n");
    }

    static void multiplication(Scanner in) {
        int n1,n2;
        System.out.print("Enter First Number: ");
        n1=in.nextInt();
        System.out.print("Enter Second Number: ");
        n2=in.nextInt();
        System.out.println("After multiplication: "+n1*n2+"\n");
    }

    static void substract(Scanner in) {
        int n1,n2;
        System.out.print("Enter First Number: ");
        n1=in.nextInt();
        System.out.print("Enter Second Number: ");
        n2=in.nextInt();
        System.out.println("After substraction: "+(n1-n2)+"\n");
    }

    static void addition(Scanner in) {
        int n1,n2;
        System.out.print("Enter First Number: ");
        n1=in.nextInt();
        System.out.print("Enter Second Number: ");
        n2=in.nextInt();
        System.out.println("After addition: "+(n1+n2)+"\n");
    }
}
