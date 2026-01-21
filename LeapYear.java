
import java.util.Scanner;

public class LeapYear{
public static void main(String[] args){

	int yr;
	Scanner yo=new Scanner(System.in);

	System.out.print("enter an year: ");
	yr=yo.nextInt();

	if((yr%4==0 && yr%100!=0)||yr%400==0)
	System.out.println("leap year");
	else
	System.out.println("not leap year");
}
}


