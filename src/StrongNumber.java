import java.util.Scanner;
public class StrongNumber {
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int num=sc.nextInt();
		int number=num,sum;
		sum=0;
		int prod=1;
		for(int i=num;i>=1;i--)
		{
			prod=prod*i;
		}
		System.out.println(prod);
		while(num>0)
		{
			num=num%10;
			sum=sum+prod;
			num=num/10;
			
		}
		if(num==sum)
		{
			System.out.println("Strong");
		}
		else
			System.out.println("not strong");
		
		
	}

}
