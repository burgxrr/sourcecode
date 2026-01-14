
import java.util.Scanner;

public class Temp{

public static void main(String[] args){

	Scanner inpt = new Scanner(System.in);
	System.out.print("enter temperature in celcuis");

	float tempC= inpt.nextFloat();
	float tempF= (tempC*9/5) + 32;

	System.out.print("temperature in farenhirt: "+tempF);

}
}

