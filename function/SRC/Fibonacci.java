
import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args){

	int n;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter the number of term\nyou want in your fibonacci series: ");
	n=in.nextInt();
	fibon(n);

}

static void fibon(int x){

	int n1=0,n2=1,sum=0;
	for(int i=1;i<=x;i++){
	sum=n1+n2;
	System.out.print(n1+" ");
	n1=n2;
	n2=sum;}
	System.out.println(" ");
}
}


