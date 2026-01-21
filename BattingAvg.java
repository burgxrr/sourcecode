
import java.util.Scanner;

public class BattingAvg{
public static void main(String[] args){

	float avg;int runs,out;
	Scanner take=new Scanner(System.in);

	System.out.print("runs scored by batsman: ");
	runs=take.nextInt();
	System.out.print("number of times batsman got out: ");
	out=take.nextInt();

	avg=(float)runs/out;

	System.out.print("batting average: "+avg);

}
}

