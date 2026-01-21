
import java.util.Scanner;

public class PrimeN2N{
public static void main(String[] args){

	int n1,n2;
	Scanner yo=new Scanner(System.in);

	System.out.print("enter two numbers: ");
	n1=yo.nextInt();
	n2=yo.nextInt();

	if(n1>n2){//condi. swapping
	int temp=n1;
	n1=n2;
	n2=temp;}

	System.out.print("prime numbers between "+n1+" and "+n2+" are: ");
	primes(n1,n2);
	System.out.println(" ");

}

static void primes(int x,int y){

	int i,j;
	for(i=x;i<=y;i++){//outer lp
	
	for(j=2;j<i;j++){//prime algo
	int rem=i%j;
	if(rem==0)
	break;}
	
	if(j==i)
	System.out.print(i+" ");
	}
}
}


	

	

