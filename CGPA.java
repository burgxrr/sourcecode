
import java.util.Scanner;

public class CGPA{
public static void main(String[] args){

	float n,mar,cred,grd=0,csum=0,CGPA;
	Scanner in=new Scanner(System.in);

	System.out.print("enter the number of subjects you got: ");
	n=in.nextInt();

	for(int i=1;i<=n;i++){
	System.out.print("marks| sub"+i+" : ");
	mar=in.nextInt();
	System.out.print("credit| sub"+i+" : ");
	cred=in.nextInt();
	grd=grd+mar*cred;
	csum=csum+cred;
	}

	CGPA=grd/(csum*10);

	System.out.println("CGPA: "+CGPA);
}
}




