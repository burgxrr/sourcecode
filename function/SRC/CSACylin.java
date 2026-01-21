
import java.util.Scanner;

public class CSACylin{
public static void main(String[] args){

	float r,h;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter radius & height\nof cylinder: ");
	r=in.nextFloat();
	h=in.nextFloat();
	System.out.println
	("curved surface area: "+csa(r,h)+" m²");

}

static float csa(float x,float y){//csa

	float pi=3.1415f;
	float cs=2*pi*x*y;

	return cs;}
}

