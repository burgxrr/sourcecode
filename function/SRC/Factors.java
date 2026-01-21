
import java.util.Scanner;

public class Factors{
public static void main(String[] args){

	int n;
	Scanner hi=new Scanner(System.in);

	System.out.print
	("enter a number: ");
	n=hi.nextInt();
	System.out.print("the factors of the number entered are: ");
	factors(n);

}

static void factors(int x){//factorslol

	for(int i=1;i<=x;i++){//factors
	int rem=x%i;
	if(rem==0)
	System.out.print
	(i+" ");}

}
}

