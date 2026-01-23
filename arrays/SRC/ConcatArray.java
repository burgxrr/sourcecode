
import java.util.Scanner;
import java.util.Arrays;

public class ConcatArray{
public static void main(String[] args){

	int[] nums={1,23,54,22};
	int[] ans=new int[2*nums.length];

	System.out.println(Arrays.toString(nums));

	for(int i=0;i<nums.length;i++){
	ans[i]=nums[i];
	ans[nums.length+i]=nums[i];}

	System.out.println(Arrays.toString(ans));
}
}


