
import java.util.Scanner;
import java.lang.Math;

public class AreaEqui{
public static void main(String[] args){

	float a;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter the side: ");
	a=in.nextFloat();

	System.out.println
	("area of equilateral triangle: "+area(a)+" m²");

}

static float area(float x){//formulae
	float ar=(float)Math.sqrt(3)/4*x*x;
	return ar;}
}


