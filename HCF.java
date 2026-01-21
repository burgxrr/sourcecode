
import java.util.Scanner;

public class HCF{
public static void main(String[] args){

	int a,b;
	Scanner in=new Scanner(System.in);

	System.out.print("enter two numbers: ");
	a=in.nextInt();
	b=in.nextInt();
	System.out.print("HCF("+a+","+b+"): ");

	if(b>a){//put in order
	int temp=a;
	a=b;
	b=temp;}

	int dvsr=b,dvdn=a;
	int rem=dvdn%dvsr;

	while(rem!=0){//HCF algo
	rem=dvdn%dvsr;
	dvdn=dvsr;
	dvsr=rem;}

	System.out.println(dvdn);
}
}

