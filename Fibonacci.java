
import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args){

	int n,sum,num1=0,num2=1,cnt=0;

	Scanner input= new Scanner(System.in);
	System.out.print("enter the number of terms you \nwant in yo fibonacci ser: ");
	n= input.nextInt();

	while(cnt!=n){
		sum=num1+num2;
		System.out.print
		(num1+" ");
		num1=num2;
		num2=sum;
		cnt++;
	}
}
}


