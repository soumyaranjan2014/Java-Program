import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number");

		int num=sc.nextInt();
		int prod=1;
		for(int i=num;i>1;i--)
		{
			prod=prod*i;
		}
		System.out.println(prod);
	}

}
