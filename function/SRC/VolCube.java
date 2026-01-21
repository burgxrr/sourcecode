
import java.util.Scanner;

public class VolCube{
public static void main(String[] args){

	float a;
	Scanner yo=new Scanner(System.in);

	System.out.print
	("enter edge of cube: ");
	a=yo.nextFloat();

	System.out.println
	("volume of a cube: "+volume(a)+" m³");
}

static float volume(float x){

	float vol=x*x*x;
	return vol;
}

}


