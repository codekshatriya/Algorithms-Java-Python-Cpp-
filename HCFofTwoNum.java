import java.util.Scanner;
class HCFofTwoNum{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n1=in.nextInt(),n2=in.nextInt(),greater=0;
//FROM THIS LINE,WE ARE USING LOGIC OF LCM OF TWO NUMBERS
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
//TILL THIS LINE greater variable has value=LCM of n1 and n2
//Using RELATIONSHIP: HCF(of n1,n2)*LCM(of n1,n2)=n1*n2
//Therefore,HCF=(n1*n2)/LCM
System.out.println("HCF of "+n1+","+n2+": "+(n1*n2)/greater);
}
}
