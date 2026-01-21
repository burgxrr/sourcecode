
import java.util.Scanner;

public class NSum{
public static void main(String[] args){

	int num,sum=0;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the numbers: ");

	do{//sum of numbers
	num=in.nextInt();
	sum=sum+num;}
	while(num!=0);

	System.out.println("the sum of numbers entered: "+sum);
}
}


