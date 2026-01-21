
import java.util.Scanner;

public class CirAreaCir{
public static void main(String[] args){

	float r;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the radius: ");
	r=in.nextFloat();
	measure(r);

}

static void measure(float r){
	float pi=3.1415f;
	float cir=2*pi*r;
	System.out.println("circumference of cicle: "+cir);
	float ar=pi*r*r;
	System.out.println("area of circle: "+ar);
}
}


