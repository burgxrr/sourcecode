
import java.util.Scanner;

public class Greeting{
public static void main(String[] args){

	String name;
	Scanner in=new Scanner(System.in);
	System.out.print("enter your name: ");
	name=in.next().trim();
	greeting(name);


}

static void greeting(String x){

	System.out.println("have a good day "+x);
}
}

