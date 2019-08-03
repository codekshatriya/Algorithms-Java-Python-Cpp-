import java.util.Scanner;
public class decimaltobinary{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
String bina="";
while(n!=0)
{
bina=Integer.toString(n%2)+bina;
n=(int)n/2;
}
System.out.print(bina);

    }
}

