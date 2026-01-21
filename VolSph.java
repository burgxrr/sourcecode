
import java.util.Scanner;

public class VolSph{
public static void main(String[] args){
	
	int r;float vol,pi=3.1415f;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the radius\nof sphere: ");
	r=in.nextInt();

	vol=(float)4/3*pi*r*r*r;

	System.out.println("volume of sphere: "+vol);

}
}

