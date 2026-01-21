
import java.util.Scanner;

public class ElecBill{
public static void main(String[] args){

	int con,rate,cost;
	Scanner in=new Scanner(System.in);

	System.out.print("electricity used(in kWh): ");
	con=in.nextInt();
	System.out.print("rate per kWh (in INR): ");
	rate=in.nextInt();
	
	cost=con*rate;

	System.out.println("energy cost (in INR): "+cost);
}
}

