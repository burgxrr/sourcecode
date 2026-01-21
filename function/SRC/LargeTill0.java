
import java.util.Scanner;

public class LargeTill0{
public static void main(String[] args){

	System.out.print
	("enter numbers: ");
	float max=largetill0();
	System.out.println("largest of numbers: "+max);
	

}

static float largetill0(){

	Scanner he=new Scanner(System.in);
	float num;float max=0;

	do{//max algorithm
	num=he.nextFloat();
	if(num>max)
	max=num;}while(num!=0);

	return max;}
}



	


