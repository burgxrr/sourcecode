
import java.util.Scanner;

public class Min{
public static void main(String[] args){

	System.out.print("enter 3 numbers: ");
	int a,b,c;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	int ans=min(a,b,c);
	System.out.println("minimum: "+ans);
	
}

static int min(int x,int y,int z){

	int min=x;
	if(y<min)
	min=y;
	else if(z<min)
	min=z;

	return min;
}
}









