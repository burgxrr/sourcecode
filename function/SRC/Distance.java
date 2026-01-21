
import java.util.Scanner;
import java.lang.Math;

public class Distance{
public static void main(String[] args){

	float x1,x2,y1,y2;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter the initial position (x1,y1): ");
	x1=in.nextFloat();
	y1=in.nextFloat();
	System.out.print
	("enter the final position (x2,y2): ");
	x2=in.nextFloat();
	y2=in.nextFloat();
	float dis=distance(x1,y1,x2,y2);
	System.out.println
	("distance: "+dis);
}

static float distance(float x1,float y1,float x2,float y2){

	float dis=(float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	return dis;}
}

