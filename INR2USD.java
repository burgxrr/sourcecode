
import java.util.Scanner;

public class INR2USD{
public static void main(String[] args){

	float inr,usd;
	System.out.print("amount in INR: ");
	Scanner inp= new Scanner(System.in);
	inr= inp.nextFloat();
	usd=inr/90;

	System.out.println(inr+" INR in USD are "+usd);

}
}

