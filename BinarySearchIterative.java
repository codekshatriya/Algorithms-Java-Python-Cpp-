/*  Created by:Harshvardhan Singh
    Univ.Roll:-181500264
    Created on IntelliJ Idea Professional at 17:00 IST
 */
package Mypack;
import java.util.Scanner;
class BinarySearchMethod// Additional class containing BSmethod to deal with the object oriented paradigm
{
    public int SearchInSequence(int[] arr,int val)
    {
        int first = 0;
        int last = arr.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (arr[middle] < val) {
                first = middle + 1;
            } else if (arr[middle] == val) {
                return middle;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            return -1;
        }
        return -1;
    }
}
public class BinarySearchIterative{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BinarySearchMethod obj=new BinarySearchMethod();
        int size=0;//User defined Size of the Array
        System.out.print("Enter array size:");
        size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter " + size + " integer values ");
        for(int t=0;t<size;)
            arr[t++]=in.nextInt();
        System.out.println("Enter value to search: ");
        int val=in.nextInt(),result=obj.SearchInSequence(arr,val);
        if(result == -1)
            System.out.println("null");
        else
            System.out.println("Found at: "+result);
    }
}
