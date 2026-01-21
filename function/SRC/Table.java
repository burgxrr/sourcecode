
import java.util.Scanner;

public class Table{
public static void main(String[] args){

	int n;
	Scanner lo=new Scanner(System.in);

	System.out.print("enter a number: ");
	n=lo.nextInt();
	table(n);

}

static void table(int x){//table of x

	for(int i=1;i<=10;i++){
	System.out.println
	(x+" × "+i+" = "+x*i);
	}
}
}


