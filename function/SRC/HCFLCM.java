
import java.util.Scanner;

public class HCFLCM{
public static void main(String[] args){

	int a,b;
	Scanner hi=new Scanner(System.in);

	System.out.print("enter two numbers: ");
	a=hi.nextInt();b=hi.nextInt();
	//a:8
	//b:24

	if(b>a){//swap
	int temp=b;
	b=a;
	a=temp;}//a:24,b:8

	System.out.println//HCF(24,8)
	("HCF of numbers: "+HCF(a,b));

	int hcf=HCF(a,b);//hcf:8
	int lcm=(a*b)/hcf;//lcm:24

	System.out.println
	("LCM of numbers: "+lcm);

}

static int HCF(int dvdn,int dvsr){//HCF
	
	int rem=1;//rem:1

	while(rem!=0){//algorithmas
		rem=dvdn%dvsr;//rem:24%8
		dvdn=dvsr;//dvdn:8
		dvsr=rem;}//dvsr:0

	return dvdn;}//return:8
}

