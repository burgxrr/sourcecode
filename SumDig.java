
import java.util.Scanner;

public class SumDig{
public static void main(String[] args){

	int num,sum=0;
	Scanner hi=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=hi.nextInt();

	while(num!=0){//sum of dig

		int dig=num%10;
		sum=sum+dig;
		num/=10;
	}

	System.out.println("sum of digits: "+sum);
}
}

