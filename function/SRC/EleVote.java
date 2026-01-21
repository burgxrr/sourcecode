
import java.util.Scanner;

public class EleVote{
public static void main(String[] args){

	int age;
	Scanner hi=new Scanner(System.in);
	
	System.out.print("enter your age: ");
	age=hi.nextInt();
	boolean Eleg=isElegible(age);
	if(Eleg)
	System.out.println("elegible hai");
	else
	System.out.println("elegible nahi hai");

}

static boolean isElegible(int x){
	if(x>=18)
	return true;
	else
	return false;
}
}
