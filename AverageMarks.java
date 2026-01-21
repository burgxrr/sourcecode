
import java.util.Scanner;

public class AverageMarks{
public static void main(String[] args){

	float s1,s2,s3,s4,s5,avg;
	Scanner in=new Scanner(System.in);

	System.out.print("enter marks in 5 of your subjects: ");
	s1=in.nextFloat();
	s2=in.nextFloat();
	s3=in.nextFloat();
	s4=in.nextFloat();
	s5=in.nextFloat();

	avg=(s1+s2+s3+s4+s5)/5;

	System.out.print("average marks: "+avg);

}
}




