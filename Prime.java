
import java.util.Scanner;

public class Prime{
public static void main(String[] args){

	int num;
	Scanner in=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=in.nextInt();
	boolean ans=isPrime(num);
	if(ans)
	System.out.println("Prime hai");
	else
	System.out.println("Prime nahi hai");
}

static boolean isPrime(int x){

        int i;
	for(i=2;i<x;i++){
	int rem=x%i;
	if(rem==0)
	return false;
	}
	if(i==x)
	return true;
	else 
	return false;
}
}




