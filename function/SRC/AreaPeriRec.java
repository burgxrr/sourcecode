
import java.util.Scanner;

public class AreaPeriRec{
public static void main(String[] args){

	float l,b;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter length & breadth: ");
	l=in.nextFloat();
	b=in.nextFloat();

	System.out.println
	("area of rectangle: "+arearect(l,b)+" m²");
	System.out.println
	("perimeter of rectangle: "+perirect(l,b)+" m");

}

static float arearect(float x,float y){
	float ar=x*y;
	return ar;}//rectangle area

static float perirect(float x,float y){
	float pr=2*(x+y);
	return pr;}//rectangle perimeter

}

class Saksham{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.print("emter your name: ");
	name=sc.next();
	System.out.println("hellow "+name);
}

}



