
import java.util.Scanner;

public class VolPrism{
public static void main(String[] args){

	float ab,h,vol;
	Scanner in=new Scanner(System.in);

	System.out.print("enter area of base and\nheight of prism: ");
	ab=in.nextFloat();
	h=in.nextFloat();

	vol=ab*h;

	System.out.println("volume of prism: "+vol);

}
}

