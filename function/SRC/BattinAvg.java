
import java.util.Scanner;

public class BattinAvg{
public static void main(String[] args){

	float runs,inning,noto;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter the runs scored: ");
	runs=in.nextFloat();
	System.out.print
	("enter the innings: ");
	inning=in.nextFloat();
	System.out.print
	("enter NOT OUTS: ");
	noto=in.nextFloat();

	float avg=batavg(runs,inning,noto);
	System.out.println
	("batting average: "+avg);

}

static float batavg(float x,float y,float z){//finding avg of runs scored

	float avg=x/(y-z);
	return avg;}
}

