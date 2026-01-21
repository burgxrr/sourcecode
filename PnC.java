
import java.util.Scanner;

public class PnC{

public static int facto(int x){
	if(x==0)
	return 1;
	else 
	return x*facto(x-1);
}

public static void main(String[] args){

	int n,r,nCr,nPr;
	Scanner in=new Scanner(System.in);
	
	System.out.print("nCr|nPr | values of n & r: ");
	n=in.nextInt();
	r=in.nextInt();

	nCr=facto(n)/(facto(r)*facto(n-r));
	nPr=facto(n)/facto(n-r);

	System.out.println("nCr: "+nCr);
	System.out.println("nPr: "+nPr);
}
}






