
import java.util.Scanner;

public class VolPyra{
public static void main(String[] args){

	int l,w,h;float vol;
	Scanner hi=new Scanner(System.in);

	System.out.print("enter base length of pyra: ");
	l=hi.nextInt();
	System.out.print("enter base width of pyra: ");
	w=hi.nextInt();
	System.out.print("enter pyramid height: ");
	h=hi.nextInt();

	vol=(float)l*w*h/3;

	System.out.println("volume of pyramid: "+vol);
}
}
	

