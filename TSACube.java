
import java.util.Scanner;

public class TSACube{
public static void main(String[] args){

	int a,tsa;
	Scanner hei=new Scanner(System.in);

	System.out.print("enter side of cube: ");
	a=hei.nextInt();

	tsa=6*a*a;

	System.out.println("total surface area of cube: "+tsa);
}
}

