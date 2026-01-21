
import java.util.Scanner;

public class VolCylin{
public static void main(String[] args){

	float r,h;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter radius and height of cylinder: ");
	r=in.nextFloat();h=in.nextFloat();

	System.out.println("volume of cylinder: "+volume(r,h)+" m³");
}

static float volume(float x,float y){

	float pi=3.1415f;
	float vol=pi*x*x*y;
	return vol;
}
}

