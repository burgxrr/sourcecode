
import java.util.Scanner;

public class ParaPrgm{
public static void main(String[] args){

	int a,b,para;
	Scanner in=new Scanner(System.in);

	System.out.print("enter base and side of the parallelogram: ");
	b=in.nextInt();
	a=in.nextInt();

	para=2*(a+b);

	System.out.println("perimeter of parallelogram: "+para);

}
}

