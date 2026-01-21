
import java.util.Scanner;

public class VolCylin{
public static void main(String[] args){

	int r,h;
	float pi=3.1415f,vol;

	Scanner take=new Scanner(System.in);

	System.out.print("enter radius and height\nof the cylinder: ");
	r=take.nextInt();
	h=take.nextInt();

	vol=(float)pi*r*r*h;

	System.out.println("volume of cylinder: "+vol);

}
}




