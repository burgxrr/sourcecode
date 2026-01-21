
import java.util.Scanner;

public class AverageN{
public static void main(String[] args){

	float n;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter the number of numbers\nyou want average of: ");
	n=in.nextFloat();
	System.out.print
	("enter those "+(int)n+" numbers: ");
	float ave=average(n);
	System.out.println("average of these numbers: "+ave);

}

static float average(float x){

	float sum=0;
	Scanner yo=new Scanner(System.in);
	for(int i=0;i<x;i++){//sum
	float num=yo.nextFloat();
	sum=sum+num;}

	return sum/x;}
}

	



