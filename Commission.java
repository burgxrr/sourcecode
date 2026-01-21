
import java.util.Scanner;

public class Commission{
public static void main(String[] args){

	float amt,cper,sales;
	Scanner in=new Scanner(System.in);

	System.out.print("enter total sales made (INR): ");
	sales=in.nextInt();
	System.out.print("enter commission rate (%): ");
	cper=in.nextInt();

	amt=cper*sales/100;

	System.out.print("commission amount (INR): "+amt);

}
}


