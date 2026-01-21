
import java.util.Scanner;

public class Discount{
public static void main(String[] args){

	float opr,npr;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the amount you shopped: ");
	opr=in.nextFloat();
	npr=discount(opr);
	System.out.println
	("final price of the shopping: "+npr);


}

static float discount(float x){

	Scanner in=new Scanner(System.in);
	float dis;
	
	System.out.print("discount% you get: ");
	dis=in.nextFloat();

	float y=x-x*dis/100;
	return y;}
}


