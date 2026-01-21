
import java.util.Scanner;

public class Factors{
public static void main(String[] args){

	int num;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the number: ");
	num=in.nextInt();

	for(int i=1;i<=num;i++){//algo
	int rem=num%i;
	if(rem==0)
	System.out.print(i+" ");}

	System.out.println("these were all the factors of "+num);
}
}



