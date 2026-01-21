
import java.util.Scanner;

public class Grade{
public static void main(String[] args){

	int gra;
	Scanner hi=new Scanner(System.in);
	
	System.out.print("enter your marks: ");
	gra=hi.nextInt();
	System.out.print("your grade: ");
	grade(gra);

}

static void grade(int x){

	if(x<=100&&x>90)
	System.out.println("AA");
	if(x<=90&&x>80)
	System.out.println("AB");
	if(x<=80&&x>70)
	System.out.println("BB");
	if(x<=70&&x>60)
	System.out.println("BC");
	if(x<=60&&x>50)
	System.out.println("CD");
	if(x<=50&&x>40)
	System.out.println("DD");
	if(x<=40)
	System.out.println("Fail");

}
}

