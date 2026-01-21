
import java.util.Scanner;

public class VolCone{
public static void main(String[] args){

	float r,h;
	Scanner tuf=new Scanner(System.in);

	System.out.print
	("enter radius and height of cone: ");
	r=tuf.nextFloat();
	h=tuf.nextFloat();

	System.out.println
	("volume of cone: "+volume(r,h)+" m³");


}

static float volume(float x,float y){

	float pi=3.1415f;
	float vol=pi*x*x*y/3;
	return vol;}

}

