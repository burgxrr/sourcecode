
import java.util.Scanner;

public class Largein3{
public static void main(String[] args){

	Scanner inp= new Scanner(System.in);
	int a,b,c;
	System.out.print("enter THREE numbers: ");
	a=inp.nextInt();
	b=inp.nextInt();
	c=inp.nextInt();
	int max=a;

	if(b>max)
	max=b;
	if(c>max)
	max=c;

	System.out.println("largest among THREE: "+max);

}
}

