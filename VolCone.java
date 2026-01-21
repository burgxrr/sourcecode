
import java.util.Scanner;

public class VolCone{
public static void main(String[] args){

	int r,h;float vol,pi=3.1415f;
	Scanner in=new Scanner(System.in);

	System.out.print("enter height and radius\nof the cone: ");
	h=in.nextInt();
	r=in.nextInt();

	vol=pi*r*r*h/3;

	System.out.println("volume of cone: "+vol);

}
}

