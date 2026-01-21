
import java.util.Scanner;

public class AreaTriPara{
public static void main(String[] args){

	float b,h;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter base & height: ");
	b=in.nextFloat();
	h=in.nextFloat();

	System.out.println
	("area of triangle: "+areatri(b,h)+" m²");
	System.out.println
	("area of parallelogram: "+areapara(b,h)+" m²");

}

static float areatri(float x,float y){
	float ar=(float)1/2*x*y;
	return ar;}//triangle

static float areapara(float x,float y){
	float ar=x*y;
	return ar;}//parallelogram

}

