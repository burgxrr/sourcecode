
import java.util.Scanner;

public class ParaRect{
public static void main(String[] args){

	int l,b,para;
	Scanner in=new Scanner(System.in);
	System.out.print("enter length and breadth \nof the rectangle: ");
	l=in.nextInt();b=in.nextInt();

	para=2*(l+b);

	System.out.println("perimeter of rectangle: "+para);

}
}

