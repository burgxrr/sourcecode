
import java.util.Scanner;

public class AreaPariCir{
public static void main(String[] args){

	float r;
	Scanner oye=new Scanner(System.in);

	System.out.print
	("enter the radius of circle: ");
	r=oye.nextFloat();

	System.out.println
	("area of circle: "+area(r)+" m²");
	System.out.println
	("perimeter of circle: "+perimeter(r)+" m");
}

static float area(float x){//area of cir
	float pi=3.1415f;
	float ar=pi*x*x;
	return ar;}

static float perimeter(float x){//peri
	float pi=3.1415f;
	float pr=2*pi*x;
	return pr;}
}


