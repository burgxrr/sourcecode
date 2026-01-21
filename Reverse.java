
import java.util.Scanner;

public class Reverse{
public static void main(String[] args){

	int num,rev=0;
	System.out.print("enter a number: ");
	Scanner take=new Scanner(System.in);
	num=take.nextInt();

	while(num>0){//revnum algo
		int dig=num%10;
		rev=rev*10+dig;
		num/=10;}

	System.out.println("reversed number: "+rev);
}
}


