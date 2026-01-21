
import java.util.Scanner;

public class AreaTrian{
public static void main(String[] args){

	float h,b,area;
	Scanner take=new Scanner(System.in);

	System.out.print("enter the height & base \nof triangle: ");
	h=take.nextFloat();
	b=take.nextFloat();

	area=(float)1/2*(b*h);

	System.out.println
	("area of triangle: "+area);
}
}


