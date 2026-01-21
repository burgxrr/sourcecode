
import java.util.Scanner;
import java.lang.Math;

public class IsosArea{
public static void main(String[] args){

	float a,b;
	Scanner take=new Scanner(System.in);

	System.out.print("equal side of \n isoscalese triangle: ");
	a=take.nextFloat();
	System.out.print("unequal side of \n isoscalese triangle: ");
	b=take.nextFloat();

	double area=(double)1/2*b*Math.sqrt(a*a-(b*b)/4);

	System.out.println
	("area of isos triangle: "+area);
}
}



