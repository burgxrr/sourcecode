
import java.util.Scanner;

public class CountNums{
public static void main(String[] args){

	int num,num1,n,occ=0;

	Scanner have=new Scanner(System.in);
	System.out.print("enter a number: ");
	num= have.nextInt();
	num1=num;
	System.out.print("enter a dig: ");
	n= have.nextInt();

	while(num>0){//occurances inc.
	int dig=num%10;
	if(dig==n)
	occ++;
	num/=10;}

	System.out.println("total occurancec of \n"+n+" in "+num1+" is "+occ);
}
}

