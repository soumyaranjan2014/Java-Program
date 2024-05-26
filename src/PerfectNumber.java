
import java.util.Scanner;
public class PerfectNumber {
		static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("number");

		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
			System.out.println("perfect");
			
		}

		else
			System.out.println("not perfect");

			
	}

}
