
import java.util.Scanner;

public class SubProSum{
public static void main(String[] args){

//the question asks you the difference of product and sum of digits in a Number

	int num,pro=1,sum=0;
	Scanner rid=new Scanner(System.in);
	
	System.out.print("enter a number: ");
	num=rid.nextInt();
	int onum=num;

	while(num!=0){//digit operation
		int dig=num%10;
		sum=sum+dig;
		pro=pro*dig;
		num/=10;}

	int dif=pro-sum;

	System.out.println("difference of product\nand sum of digits: "+dif);
}
}

