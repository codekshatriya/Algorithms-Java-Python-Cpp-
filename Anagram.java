import java.util.Scanner;
class Anagram{  
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String t=sc.next();
int c=0;
byte i=0;
for(;i<s.length();i++)
{	for(byte j=0;j<t.length();j++)
	{
		if(s.charAt(i)==t.charAt(j)){c++;break;}
	}
}
if(c==s.length()){System.out.print("YES");}
else{System.out.print("NO"+c);}
}}
