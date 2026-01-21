
import java.util.Scanner;

public class SI{
public static void main(String[] args){

	float ans,p,t,r;
	Scanner in=new Scanner(System.in);

	System.out.print("enter principal , time \nand rate of interest: ");
	p=in.nextFloat();
	t=in.nextFloat();
	r=in.nextFloat();

	ans=si(p,t,r);
	System.out.println("amount becomes: "+ans);

}

static float si(float x,float y,float z){
	//SI fomulae aso far
	float a=x*y*z/100;
	return a;}

}

