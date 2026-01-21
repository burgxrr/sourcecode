
import java.util.Scanner;

public class Factorial{
public static void main(String[] args){

	int num,fact=1;
	Scanner in=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=in.nextInt();

	for(int i=num;i>0;i--){
		fact=fact*i;
	}

	System.out.println("factorial of "+num+" is "+fact);

}
}

