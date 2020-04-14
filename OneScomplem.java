/*
Program to calculate 1's complement of a binary number
Created On,at & By: intelliJ Idea Pro,13 April 2020 & Harshvardhan Singh
*/
package Pack1;
import java.util.Scanner;
public class OneScomplem{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a decimal Number: ");
        int num=in.nextInt();
        char[] binRep=Integer.toBinaryString(num).toCharArray();
        System.out.println("Binary Representation of "+num+" : "+new String(binRep));
        int len=binRep.length;
        for(int a=0;a<len;a++)
        {
            binRep[a]=(binRep[a]=='0')?'1':'0';//logic to invert each character(0->1 , 1->0)
        }
        System.out.println("1's Compliment: "+new String(binRep));
    }
}
