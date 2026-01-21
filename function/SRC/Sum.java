
import java.util.Scanner;

public class Sum{
public static void main(String[] args){

	int a,b;
	Scanner in=new Scanner(System.in);

	System.out.print("enter two num: ");
	a=in.nextInt();b=in.nextInt();
	int ans=sum(a,b);
	System.out.println("sum: "+ans);

}

static int sum(int x,int y){
	int sum=x+y;
	return sum;
}
}

