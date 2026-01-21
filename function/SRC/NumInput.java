
import java.util.Scanner;

public class NumInput{
public static void main(String[] args){

	int num;
	
	System.out.print("enter the numbers bitch: ");
	int n=sumnum();
	System.out.println("sum of numbers: "+n);

}

static int sumnum(){

	Scanner ye=new Scanner(System.in);
	int sum=0,x;

	do{//checks condition at end
	x=ye.nextInt();
	sum=sum+x;
	}while(x!='x');

	return sum;
}
}

	
