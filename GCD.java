/*
Greatest Common Divisor(GCD) of Two Numbers
Created On,at & By: intelliJ Idea Pro,13 April 2020 & Harshvardhan Singh
*/
package Pack1;
import java.util.Scanner;
public class GCD{
    static byte maxFind(int n,int m)
    {
        return (n>m)?(byte)n:(byte)m;
    }
    static boolean bothNonZero(int n2,int n1)
    {
        return n1!=0 && n2!=0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte n1=in.nextByte(),n2=in.nextByte();
        if ( n1 == n2)
            System.out.println(n1+" is the gcd of :"+n1+","+n2);
        else if(bothNonZero(n1,n2))
        {
         byte max=maxFind(n1,n2);
         while(max-->0)
         {
             if(n1%max==0 && n2%max==0)
             {
                 System.out.println(max+" is the gcd of :"+n1+","+n2);
                 break;
             }
         }
        }
        else
            System.out.println(0+" is the gcd of :"+n1+","+n2);
    }
}
