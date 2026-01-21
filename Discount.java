
import java.util.Scanner;

public class Discount{
public static void main(String[] args){

	//discount over a perticular val.
	
	float cost,dis=0.0f,price;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the amount you shopped: ");
	cost=in.nextFloat();

	if(cost>=2700){
	dis=(float)10/100*cost;}

	price=cost-dis;
	System.out.println("cost after discount: "+price);

}
}


