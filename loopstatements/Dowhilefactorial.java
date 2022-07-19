package loopstatements;
import java.util.Scanner;
public class Dowhilefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int num,i=1,f=1;
		System.out.println("Enter any number");
		num=in.nextInt();
		do
		{
			f=f*i;
			i++;
		}
		while(i<=num);
		System.out.println("the factorial of" +num+" is "+f);
	}

}
