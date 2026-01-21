
import java.util.Scanner;

public class Calc{
public static void main(String[] args){

	int a,b;
	Scanner yo=new Scanner(System.in);
	System.out.print("enter two numbers: ");
	a=yo.nextInt();b=yo.nextInt();
	Calc(a,b);

}

static void Calc(int x,int y){
	char oper;
	Scanner hi=new Scanner(System.in);
	System.out.print
	("operation(+,-,*,/,%): ");
	oper=hi.next().charAt(0);

	switch(oper){
	case '+':
	System.out.println
	(x+" + "+y+" = "+(x+y));break;
	case '-':
	System.out.println
	(x+" - "+y+" = "+(x-y));break;
	case '*':
	System.out.println
	(x+" * "+y+" = "+(x*y));break;
	case '/':
	System.out.println
	(x+" / "+y+" = "+(float)(x/y));
	break;
	case '%':
	System.out.println
	(x+" % "+y+" = "+(x%y));break;
	}
}
}


