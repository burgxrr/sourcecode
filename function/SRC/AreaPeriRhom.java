
import java.util.Scanner;

public class AreaPeriRhom{
public static void main(String[] args){

	float a,d1,d2;
	Scanner hi=new Scanner(System.in);

	System.out.print
	("enter side , diag1 and diag2: ");
	a=hi.nextFloat();
	d1=hi.nextFloat();
	d2=hi.nextFloat();
	
	System.out.println
	("perimeter of rhombus: "+perirhom(a)+" m");
	System.out.println
	("area of rhombus: "+arearhom(d1,d2)+" m²");
	System.out.println
	("these two are different rhombuses BTW");


}

static float perirhom(float x){//peri
	float pr=4*x;
	return pr;}

static float arearhom(float x,float y){
	//area
	float ar=(float)1/2*x*y;
	return ar;}
}

