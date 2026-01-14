
import java.util.Scanner;

public class Calc{

public static void main(String[] args){

	Scanner have=new Scanner(System.in);
	System.out.print("enter a number: ");
	int num1= have.nextInt();
	System.out.print("enter another number: ");
	int num2= have.nextInt();
	System.out.print("operator(+,-,*,/): ");
	char oper= have.next().charAt(0);


	if(oper=='+')
	System.out.println
	(num1+" + "+num2+" = "+(num1+num2));
	else if(oper=='-')
	System.out.println
	(num1+" - "+num2+" = "+(num1-num2));
	else if(oper=='*')
	System.out.println
	(num1+" * "+num2+" = "+(num1*num2));
	else if(oper=='/')
	System.out.println
	(num1+" / "+num2+" = "+(num1/num2));

}
}
	
