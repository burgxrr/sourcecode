
import java.util.Scanner;

public class SumN{
public static void main(String[] args){

	int n,sum=0,num;
	Scanner eye=new Scanner(System.in);

	System.out.print("enter the number of numbers\n you want sum of: ");
	n=eye.nextInt();
	System.out.print("enter all those "+n+" numbers: ");

	for(int i=0;i<n;i++){//collect
	num=eye.nextInt();
	sum=sum+num;}

	System.out.print("sum of all the numbers: "+sum);
}
}

