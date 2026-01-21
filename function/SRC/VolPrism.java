
import java.util.Scanner;

public class VolPrism{
public static void main(String[] args){

	float arb,h;
	Scanner hey=new Scanner(System.in);

	System.out.print
	("enter area of base and height: ");
	arb=hey.nextFloat();
	h=hey.nextFloat();

	System.out.println
	("volume of prism: "+volume(arb,h)+" m³");

}

static float volume(float x,float y){

	float vol=x*y;
	return vol;
}
}


