
import java.util.Scanner;

public class Palindrome{
public static void main(String[] args){

	int num,revn=0;
	Scanner in=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=in.nextInt();
	int onum=num;

	while(num!=0){//revnum
		int dig=num%10;
		revn=revn*10+dig;
		num/=10;
	}

	if(onum==revn)//palindrome
	System.out.println("palindrome");
	else
	System.out.println("non palindrome");
}
}




