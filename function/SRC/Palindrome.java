
import java.util.Scanner;

public class Palindrome{
public static void main(String[] args){

	int num;
	Scanner hi=new Scanner(System.in);

	System.out.print("enter a number: ");
	num=hi.nextInt();
	boolean ans=palind(num);
	if(ans)
	System.out.println("Palindrome");
	else
	System.out.println("non-Palindrome");


}

static boolean palind(int x){

	int onum=x,revn=0;
	while(x>0){
	int dig=x%10;
	revn=revn*10+dig;
	x=x/10;
	}

	if(revn==onum)
	return true;
	else
	return false;
}
}

