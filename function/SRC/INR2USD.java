
import java.util.Scanner;

public class INR2USD{
public static void main(String[] args){

	float inr;
	Scanner hi=new Scanner(System.in);

	System.out.print
	("enter the amount in INR: ");
	inr=hi.nextFloat();

	float usd=inr2usd(inr);
	System.out.println
	(inr+" INR in USD are: "+usd);

}

static float inr2usd(float x){//conversion
	
	float y=x/90.87f;
	return y;}

}


