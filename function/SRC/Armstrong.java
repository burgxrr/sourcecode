
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
public static void main(String[] args){

	int n1,n2;
	Scanner in=new Scanner(System.in);

	System.out.print
	("enter two numbers: ");
	n1=in.nextInt();n2=in.nextInt();

	if(n1>n2){//swap
	int temp=n1;
	n1=n2;
	n2=temp;}

	armstrong(n1,n2);//call

}

static void armstrong(int x,int y){

for(int i=x;i<=y;i++){//outer loop
	
	int i1=i,i2=i;
	int cnt=0;
	while(i1!=0){//count digits
	cnt++;
	i1=i1/10;}

	int sum=0;
	while(i2!=0){//armstrong algo
	int dig=i2%10;
	sum=sum+(int)Math.pow(dig,cnt);
	i2=i2/10;}

	if(i==sum)
	System.out.print(i+" ");
}
}
}










