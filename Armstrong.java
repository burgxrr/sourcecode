
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
public static void main(String[] args){

	int fir,las,temp;
	System.out.print("tell the numbers you want\nto find armstrong numbers\nbetween: ");
	Scanner take=new Scanner(System.in);

	fir=take.nextInt();//input both
	las=take.nextInt();

	if(las<fir){//arrange
		temp=fir;
		fir=las;
		las=temp;
	}

for(int i=fir;i<=las;i++){//arm undr loop
	
	int num1=i,num2=i,cnt=0;
	double sum=0;

	while(num1!=0){//counting dig
		cnt++;
		num1=num1/10;}

	while(num2!=0){//armstrong algo
		int dig=num2%10;
		sum=sum+Math.pow(dig,cnt);
		num2=num2/10;}

	if(sum==i)//condition to print
	System.out.print(i+" ");
}

System.out.println(" ");
}
}



