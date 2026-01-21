
import java.util.Scanner;

public class Product{
public static void main(String[] args){

	int a,b;
	Scanner in=new Scanner(System.in);

	System.out.print("enter two num: ");
	a=in.nextInt();b=in.nextInt();
	int ans=product(a,b);
	System.out.println("product: "+ans);

}

static int product(int x,int y){
	int product=x*y;
	return product;
}
}

