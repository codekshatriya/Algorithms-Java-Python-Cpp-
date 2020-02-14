import java.util.Scanner;
//program to take date as input from user in format e.g. (11,12,2001)
//prints the output in format 11/12/2001
class DateFormat{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String sarr[]=s.split(",");
int len=s.length();
System.out.println(sarr[0].substring(1)+"/"+sarr[1]+"/"+sarr[2].substring(0,sarr[2].length()-1));
}}
