
import java.util.Scanner;

public class SumNatural{
public static void main(String[] args){

	int n;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the natural number\nyou want the sum till: ");
	n=in.nextInt();
	int sum=sumN(n);
	System.out.println("the sum of numbers: "+sum);


}

static int sumN(int x){

	if(x==1)
	return 1;
	else
	return x+sumN(x-1);
}
}
	
