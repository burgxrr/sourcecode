
import java.util.Scanner;

public class EvenOdd{
public static void main(String[] args){

	int num;
	Scanner in=new Scanner(System.in);
	
	System.out.print("enter a number: ");
	num=in.nextInt();
	String ans=EvOd(num);
	System.out.println("the number is "+ans);
	
}

static String EvOd(int x){

	int rem=x%2;
	if(rem==0)
	return "Even";
	else
	return "Odd";
}
}




