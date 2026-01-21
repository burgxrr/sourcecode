
import java.util.Scanner;

public class Max{
public static void main(String[] args){

	System.out.print("enter 3 numbers: ");
	int a,b,c;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	int ans=max(a,b,c);
	System.out.println("maximum: "+ans);
	
}

static int max(int x,int y,int z){

	int max=x;
	if(y>max)
	max=y;
	else if(z>max)
	max=z;

	return max;
}
}








