
import java.util.Scanner;

public class SI{

public static void main(String[] args){

	Scanner take= new Scanner(System.in);
	System.out.print("principal amount: ");
	int P=take.nextInt();
	System.out.print("total time: ");
	int T=take.nextInt();
	System.out.print("rate of interest: ");
	int R=take.nextInt();

	int si=P*R*T/100;
	System.out.println
	("simple interest: "+si);
}
}


