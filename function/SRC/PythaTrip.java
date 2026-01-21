
import java.util.Scanner;

public class PythaTrip{
public static void main(String[] args){

	int a,b,c,max;
	Scanner in=new Scanner(System.in);

	System.out.print("enter three numbers: ");
	a=in.nextInt();//a:3
	b=in.nextInt();//b:5
	c=in.nextInt();//c:4
	max=a;//max:3
	
	if(b>max){//swap
	int temp=max;
	max=b;
	b=temp;}//b:3,max:5
	
	if(c>max){//swap
	int temp=max;
	max=c;
	c=temp;}//asshole error had b`c

	// now b and c have the smaller values among the three and max have the max
	
	boolean ans= isPytha(b,c,max);
	if(ans)
	System.out.println("Pythagorean Triplet");
	else
	System.out.println("not Pythagorean Triplet");

}

static boolean isPytha(int x,int y,int h){//checks 

	int sumsqr=x*x+y*y;//sumsqr=9+16
			   //sumsqr:25
	if(sumsqr==h*h)//h:25
	return true;
	else
	return false;
}
}



	





