
import java.util.Scanner;

public class AreaCircle{
public static void main(String[] args){

	float pi=3.1415f;
	float r,area;

	System.out.print("enter the radius: ");
	Scanner take=new Scanner(System.in);
	r= take.nextFloat();
	area=pi*r*r;

	System.out.println("area of circle: "+area);
}
}


