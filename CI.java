
import java.util.Scanner;
import java.lang.Math;

public class CI{
public static void main(String[] args){

	float p,r,n,t;
	Scanner le=new Scanner(System.in);

	System.out.print("principal amount: ");
	p=le.nextFloat();
	System.out.print("interest rate: ");
	r=le.nextFloat();
	System.out.print("number of times interest applied: ");
	n=le.nextFloat();
	System.out.print("number time periods: ");
	t=le.nextFloat();

	double a=p*Math.pow(1+r/n,n*t);
	double ci=a-p;

	System.out.println("compound interest: "+ci);

}
}


