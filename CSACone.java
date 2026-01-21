
import java.util.Scanner;

public class CSACone{
public static void main(String[] args){

	int l,r;float pi=3.1415f,csa;
	Scanner yo=new Scanner(System.in);

	System.out.print("enter slantheight and radius\nof the cone: ");
	l=yo.nextInt();
	r=yo.nextInt();

	csa=(float)pi*r*l;

	System.out.println("curved surface area of cone: "+csa);
}
}

