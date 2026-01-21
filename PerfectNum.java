
import java.util.Scanner;

public class PerfectNum{
public static void main(String[] args){

	int num,sum=0;
	Scanner in=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=in.nextInt();

	for(int i=1;i<num;i++){//sum of all the factors yahi milega,
		int rem=num%i;
		if(rem==0)
		sum=sum+i;
	}

	if(sum==num)
	System.out.println("perfect number");
	else
	System.out.println("non perfect number");
}
}






