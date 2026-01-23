
import java.util.Scanner;
import java.util.Arrays;

public class RunningSum{
public static void main(String[] args){

	int[] nums={2,32,44,12,4};
	int[] runSum=new int[nums.length];

	System.out.println(Arrays.toString(nums));

	for(int i=0;i<nums.length;i++){
	for(int j=0;j<=i;j++){
	runSum[i]=runSum[i]+nums[j];}}

	System.out.println(Arrays.toString(runSum));
}
}

