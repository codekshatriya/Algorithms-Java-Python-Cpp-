import java.util.Scanner;
//Count occurence of characters in String with O(n) complexity
class CharOccurStr{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int[] occur=new int[26];
String s=in.next();//input in lowercase alphabetic string
int len=s.length();
for(int i=0;i<len;i++)
	occur[s.charAt(i)-97]++;
for(int i=0;i<26;i++)
	System.out.println((char)(97+i)+": "+occur[i]);
}
}
	
