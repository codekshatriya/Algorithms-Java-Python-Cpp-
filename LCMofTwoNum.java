import java.util.Scanner;
class LCMofTwoNum{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n1=in.nextInt(),n2=in.nextInt(),greater=0;
if(n1==n2)
	greater=n1;
else
	greater=(n1>n2)?n1:n2;
while(true)
{
	if (greater % n1==0 && greater % n2==0)
	{
		break;
	}
	greater++;
}
System.out.println("LCM of "+n1+","+n2+": "+greater);
}
}
