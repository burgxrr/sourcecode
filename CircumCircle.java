
import java.util.Scanner;

public class ParaCircle{
public static void main(String[] args){

	float r,para,pi=3.1415f;
	Scanner in=new Scanner(System.in);
	System.out.print("enter the radius: ");
	r=in.nextFloat();

	para=2*pi*r;

	System.out.println("parameter of circle: "+para);
}
}


