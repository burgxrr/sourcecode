
import java.util.Scanner;

public class AreaRhom{
public static void main(String[] args){

	float p,q,area;
	Scanner input=new Scanner(System.in);
	System.out.print("enter a diagonal: ");
	p=input.nextFloat();
	System.out.print("enter another diagonal: ");
	q=input.nextFloat();

	area=(float)1/2*(p*q);

	System.out.println("area of rhombus: "+area);
}
}







