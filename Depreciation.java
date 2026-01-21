
import java.util.Scanner;
import java.lang.Math;

public class Depreciation{
public static void main(String[] args){

	float pv,n,r;
	Scanner in=new Scanner(System.in);

	System.out.print("enter principal value: ");
	pv=in.nextFloat();
	System.out.print("enter depreciation rate: ");
	r=in.nextFloat();
	System.out.print("enter number of years: ");
	n=in.nextFloat();

	double fv=pv*Math.pow(1+r/100,n);

	System.out.println("final value: "+fv);
}
}



