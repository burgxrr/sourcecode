
import java.util.Scanner;
import java.util.Arrays;

public class RichConWea{
public static void main(String[] args){

int accounts[][]={{1,2,3},{3,2,1}};

System.out.println(Arrays.toString(accounts[accounts.length]));
int sum=0;int max=sum;

for(int i=0;i<accounts.length;i++){
for(int j=0;j<accounts[i].length;j++){
	sum=sum+accounts[i][j];}
	if(sum>max){//returning max
		max=sum;}}

System.out.println("maximum wealth: "+max);
}
}

