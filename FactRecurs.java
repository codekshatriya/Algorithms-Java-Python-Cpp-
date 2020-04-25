package p1;
//Recursive Factorial Calculator, developed by Harshvardhan Singh(harshvs.official223@gmail.com)
//Created on Intellij idea,25 December 2019
import java.util.Scanner;
public class FactRecurs{
    static int fac(int n)
    {
        return (n==0)?1:n*fac(--n);
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter Number to Get Factorial: ");
        System.out.println(fac(sc.nextInt()));
    }
}
