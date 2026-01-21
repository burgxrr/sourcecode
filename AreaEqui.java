
import java.util.Scanner;
import java.lang.Math;

public class AreaEqui{
public static void main(String[] args){

	int a;
	Scanner take=new Scanner(System.in);

	System.out.print("enter side of equilateral tri: ");
	a=take.nextInt();

	double area=(float)Math.sqrt(3)/4*(a*a);

	System.out.println("area of equilateral tri: "+area);
}
}
	
