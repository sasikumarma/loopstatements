package loopstatements;
import java.util.Scanner;

public class Whilefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num,f=1,i=1;
		System.out.println("Enter any number");
		num=in.nextInt();
		while(i<=num)
		{
			f=f*i;
			i++;
		}
		System.out.println("the factorial of" +num+" is "+f);
	}

}
