
import java.util.Scanner;

public class Larger{

public static void main(String[] args){

	int num1,num2,lar=0;
	Scanner take=new Scanner(System.in);
	System.out.print("enter two mumbers: ");
	num1=take.nextInt();
	num2=take.nextInt();

	if(num1>num2)
	lar=num1;
	else
	lar=num2;

	System.out.println(lar+" is the larger among both");
}
}



