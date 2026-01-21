
import java.util.Scanner;

public class Factorial{
public static void main(String[] args){

	int n;
	Scanner in=new Scanner(System.in);

	System.out.print("enter a number: ");
	n=in.nextInt();
	System.out.println("factorial("+n+"): "+factorial(n));

}

static int factorial(int x){

	if(x==0)
	return 1;
	else
	return x*factorial(x-1);

}
}

