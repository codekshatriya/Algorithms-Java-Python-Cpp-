/*
Program to calculate 1's complement & 2's complement of a binary number
Created On,at & By: intelliJ Idea Pro,13 April 2020 & Harshvardhan Singh
*/
package Pack1;
import java.util.Scanner;
public class OnesTwosComple{
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
        for(int i=len-1;i>=0;i--)//for 2's Complement iterate from n-1 to 0 index
        {
            if(binRep[i]=='0') {//check until first 0 doesn't come
                binRep[i] = '1';//till then replace all '1' with '0'
                break;//when first '0' met, replace also that index by '1'(carry)
            }// and print the string
            else
                binRep[i]='0';

        }
        System.out.println("2's Compliment: "+new String(binRep));
    }
}
