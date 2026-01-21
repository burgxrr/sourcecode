
import java.util.Scanner;
import java.lang.Math;

public class Distance{
public static void main(String[] args){

	int xi,xf,yi,yf;
	Scanner input= new Scanner(System.in);

	System.out.print("enter initial coordinates(x1,y1) : ");
	xi=input.nextInt();
	yi=input.nextInt();
	System.out.print("enter final coordinates(x2,y2) : ");
	xf=input.nextInt();
	yf=input.nextInt();

	double dis=Math.sqrt((xf-xi)*(xf-xi)+(yf-yi)*(yf-yi));

	System.out.println("distance: "+dis);
}
}


