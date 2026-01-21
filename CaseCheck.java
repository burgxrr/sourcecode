
import java.util.Scanner;

public class CaseCheck{
public static void main(String[] args){

	Scanner inp=new Scanner(System.in);
        System.out.print("enter an alphabet: ");
	char ch=inp.next().trim().charAt(0);
	
	if(ch>='a' && ch<='z'){
	System.out.println("small letter");
	}else{
	System.out.println("capital letter");
	}
}
}

