import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
		System.out.println();
	}

}
}
