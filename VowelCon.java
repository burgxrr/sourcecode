
import java.util.Scanner;

public class VowelCon{
public static void main(String[] args){

	char ch;
	Scanner in=new Scanner(System.in);

	System.out.print("enter an Alphaber: ");
	ch=in.next().trim().charAt(0);

	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	System.out.println("vowel");
	else
	System.out.println("consonant");
}
}

