
import java.util.Scanner;

public class SumTill0{
public static void main(String[] args){

	System.out.print
	("enter numbers: ");
	float sum=sumtill0();
	System.out.println("sum of numbers: "+sum);
	

}

static float sumtill0(){

	Scanner he=new Scanner(System.in);
	float sum=0;float num;

	do{//collects sum of numbers
	num=he.nextFloat();
	sum=sum+num;
	}while(num!=0);

	return sum;}
}


	


