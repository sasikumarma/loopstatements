
package loopstatements;
import java.util.Scanner;
public class Forloopfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num,f=1;
		System.out.println("Enter any number");
		num=in.nextInt();
		for(int i=1; i<=num; i++)
		{
			f=f*i;
			
		}
		System.out.println("the factorial of" +num+" is "+f);
			
		
		

	}

}
