
import java.util.Scanner;

public class VolSphere{
public static void main(String[] args){

	float r;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter radius of sphere: ");
	r=in.nextFloat();

	System.out.println("volume of sphere: "+volume(r)+" m³");
}

static float volume(float x){

	float pi=3.1415f;
	float vol=(float)4/3*pi*x*x*x;
	return vol;
}
}


